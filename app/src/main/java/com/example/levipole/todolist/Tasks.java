package com.example.levipole.todolist;

public class Tasks {

    // Store text
    private String text;
    // Store date
    private String itemDate;
    // Store priority
    private int priority;

    // Constructor
    public Tasks(String text, String itemDate, int priority)
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

    public String getItemDate() {
        return itemDate;
    }

    public void setItemDate(String itemDate) {
        this.itemDate = itemDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
