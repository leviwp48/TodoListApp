package com.example.levipole.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;

import static com.example.levipole.todolist.MainActivity.ITEM_POSITION;
import static com.example.levipole.todolist.MainActivity.ITEM_TEXT;


public class EditItemActivity extends AppCompatActivity {


    EditText etItemText;
    // position of edited item in list
    int position;

    ArrayList<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        // resolve edit text from layout
        etItemText = (EditText) findViewById(R.id.etItemText);
        // set edit text value from intent extra
        etItemText.setText(getIntent().getStringExtra(ITEM_TEXT));
        // update position from intent extra
        position = getIntent().getIntExtra(ITEM_POSITION, 0);
        // update the title bar of the activity
        getSupportActionBar().setTitle("Edit Item");
    }

    // handler for save button
    public void onSaveItem(View v) {
        // prepare new intent for result
        Intent i = new Intent();
        // pass updated item text as extra
        i.putExtra(ITEM_TEXT, etItemText.getText().toString());
        // pass origianl position as extra
        i.putExtra(ITEM_POSITION, position);
        // set the intent as the result of the activity
        setResult(RESULT_OK, i);
        // close the activity and redirect to main
        finish();
    }
}
