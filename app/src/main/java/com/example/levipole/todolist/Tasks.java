package com.example.levipole.todolist;

import java.util.Date;

public class Tasks {

    // Store text
    private String text;
    // Store date
    private Date itemDate;
    // Store priority
    private int priority;

    // Constructor
    public Tasks(String text, Date itemDate, int priority)
    {
        this.text = text;
        this.itemDate = itemDate;
        this.priority = priority;
    }

    // Setter and Getter
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setItemDate(Date date) {
        this.itemDate = date;
    }

    public Date getItemDate(){
        return itemDate;
    }
}