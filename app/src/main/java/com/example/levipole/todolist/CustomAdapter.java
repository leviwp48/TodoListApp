package com.example.levipole.todolist;

import android.support.annotation.LayoutRes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;


import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Tasks> {

    private Context mContext;
    private List<Tasks> tasksList = new ArrayList<>();

    public CustomAdapter(Context context, ArrayList<Tasks> list){
        super(context, 0, list);

        mContext = context;
        tasksList = list;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(android.R.layout.simple_list_item_1,parent,false);

        Tasks currentTask = tasksList.get(position);

        TextView text = (TextView)listItem.findViewById(R.id.itemText);
        text.setText(currentTask.getText());

        EditText date = (EditText)listItem.findViewById(R.id.itemDate);
        currentTask.setItemDate(currentTask.getItemDate());

        EditText Priority = (EditText) listItem.findViewById(R.id.itemPriority);
        currentTask.setPriority(currentTask.getPriority());

        return  listItem;
    }

}
