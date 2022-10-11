package com.fullstackapp.todo.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class ToDoItemDto {

    @Positive
    private Long id;
    @NotBlank
    private String task;
    @NotNull
    private Boolean isDone;

    public ToDoItemDto() {
    }

    public ToDoItemDto(Long id, String task, Boolean isDone) {
        this.id = id;
        this.task = task;
        this.isDone = isDone;
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

    public void setIsDone(Boolean done) {
        isDone = done;
    }
}
