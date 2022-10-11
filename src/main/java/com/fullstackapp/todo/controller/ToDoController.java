package com.fullstackapp.todo.controller;

import com.fullstackapp.todo.entity.ToDoItem;
import com.fullstackapp.todo.model.ToDoItemDto;
import com.fullstackapp.todo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("api/todoItems")
@RestController
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @PostMapping
    public ResponseEntity<ToDoItem> createNewToDoItem(){ //@RequestBody ToDoItem toDoItem
        ToDoItem newToDoItem = toDoService.createNewToDoItem();
        return ResponseEntity.ok(newToDoItem);
    }

    @GetMapping
    public ResponseEntity<List<ToDoItem>> fetchAllToDoItems(){
        List<ToDoItem> toDoItems = toDoService.fetchAllToDoItems();
        return ResponseEntity.ok(toDoItems);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ToDoItem> updateToDoItem(@PathVariable("id") Long id, @Valid @RequestBody ToDoItemDto toDoItemDto){
        ToDoItem updatedToDoItem = toDoService.updateToDoItems(id, toDoItemDto);
        return ResponseEntity.ok(updatedToDoItem);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteToDoItem(@PathVariable("id") Long id){
        toDoService.deleteToDoItems(id);
        return ResponseEntity.ok("Todo item is successfully deleted");
    }
}
