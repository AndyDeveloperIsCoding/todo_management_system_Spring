package com.fullstackapp.todo.entity;

import javax.persistence.*;

@Entity
@Table(name = "ToDoList")
public class ToDoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String task;
    private Boolean isDone;

    public ToDoItem(String task, Boolean isDone) {
        this.task = task;
        this.isDone = isDone;
    }

    public ToDoItem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Boolean getIsDone() {
        return isDone;
    }

    public void setIsDone(Boolean isDone) {
        this.isDone = isDone;
    }
}
