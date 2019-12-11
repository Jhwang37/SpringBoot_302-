package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 1)
    private String taskName;
    @NotNull
    @Size(min = 1)
    private String dueDate;
    @NotNull
    @Size(min = 1)
    private String pRio;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getpRio() {
        return pRio;
    }

    public void setpRio(String pRio) {
        this.pRio = pRio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}