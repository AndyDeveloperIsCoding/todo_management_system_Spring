package com.fullstackapp.todo;

import com.fullstackapp.todo.entity.ToDoItem;
import com.fullstackapp.todo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoManagementSystemSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TodoManagementSystemSpringApplication.class, args);
	}

	// TEMP follows:
	@Autowired
	private ToDoRepository toDoRepository;

	@Override
	public void run(String... args) throws Exception {
		toDoRepository.save(new ToDoItem("Buy sugar", true));
		toDoRepository.save(new ToDoItem("Walk the dog", true));
		toDoRepository.save(new ToDoItem("Listen to jazz", false));
	}
}
