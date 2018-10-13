package com.example.levipole.todolist;

import java.util.Date;

public class Tasks {

    private String description;
    private Date date;
    private int priority;

    // Constructor

    public Tasks(String desription, Date date, int priority)
    {
        this.description = desription;
        this.date = date;
        this.priority = priority;
    }

    // Setter and Getter


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
