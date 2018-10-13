package com.example.levipole.todolist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.Date;

public class CustomAdapter extends ArrayAdapter<String> {

    Context context;
    int priority;
    Date date;
    String list[];

    public CustomAdapter(Context context, int priority, Date date, String[] list){
        super(context, R.layout.List_row, list);

        this.context = context;
        this.date = date;
        this.list = list;
        this.priority = priority;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;

        return super.getView(position, convertView, parent);
    }

}
