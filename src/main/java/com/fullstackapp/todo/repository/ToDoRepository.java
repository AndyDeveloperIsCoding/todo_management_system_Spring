package com.fullstackapp.todo.repository;

import com.fullstackapp.todo.entity.ToDoItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDoItem, Long> {

}
