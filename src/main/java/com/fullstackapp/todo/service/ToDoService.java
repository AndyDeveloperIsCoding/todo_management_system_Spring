package com.fullstackapp.todo.service;

import com.fullstackapp.todo.entity.ToDoItem;
import com.fullstackapp.todo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDoItem> fetchAllToDoItems() {
        return (List<ToDoItem>) toDoRepository.findAll();
    }

    public ToDoItem updateToDoItems(Long id, ToDoItem toDoItem) {
        Optional<ToDoItem> optionalToDoItem = toDoRepository.findById(id);
        if (optionalToDoItem.isPresent()) {
            ToDoItem toDoItemToUpdate = optionalToDoItem.get();
            toDoItemToUpdate.setTask(toDoItem.getTask());
            toDoItemToUpdate.setIsDone(toDoItem.getIsDone());
            toDoRepository.save(toDoItemToUpdate);
            return toDoItemToUpdate;
        }
        return null;
    }

    public ToDoItem createNewToDoItem() { // ToDoItem toDoItem
        ToDoItem newToDoItem = new ToDoItem();
        newToDoItem.setTask("New task");
        newToDoItem.setIsDone(false);
        toDoRepository.save(newToDoItem);
        return newToDoItem;
    }

    public ToDoItem deleteToDoItems(Long id) {
        Optional<ToDoItem> optionalDeleteToDoItem = toDoRepository.findById(id);
        if (optionalDeleteToDoItem.isPresent()) {
            ToDoItem deleteToDoItem = optionalDeleteToDoItem.get();
            toDoRepository.delete(deleteToDoItem);
            return deleteToDoItem;
        }
        return null;
    }
}
