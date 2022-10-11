package com.fullstackapp.todo.controller;

import com.fullstackapp.todo.entity.ToDoItem;
import com.fullstackapp.todo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("api/todoItems")
@RestController
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @PostMapping
    public ResponseEntity<?> createNewToDoItem(){ //@RequestBody ToDoItem toDoItem
        ToDoItem newToDoItem = toDoService.createNewToDoItem();
        return ResponseEntity.ok(newToDoItem);
    }

    @GetMapping
    public ResponseEntity<?> fetchAllToDoItems(){
        List<ToDoItem> toDoItems = toDoService.fetchAllToDoItems();
        return ResponseEntity.ok(toDoItems);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateToDoItem(@PathVariable("id") Long id, @RequestBody ToDoItem toDoItem){
        ToDoItem updatedToDoItem = toDoService.updateToDoItems(id, toDoItem);
        return ResponseEntity.ok(updatedToDoItem);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteToDoItem(@PathVariable("id") Long id){
        ToDoItem deleteToDoItem = toDoService.deleteToDoItems(id);
        return ResponseEntity.ok("Todo item is successfully deleted");
    }
}
