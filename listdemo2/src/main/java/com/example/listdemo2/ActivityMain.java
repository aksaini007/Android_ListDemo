package com.example.listdemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myList = (ListView) findViewById(R.id.demo_list);

        ArrayList<NoteItems> noteItems = new ArrayList<>();

        NoteItems item = new NoteItems();
        item.setHeading("1st Heading");
        item.setDescription("This is the description of first heading.");
        noteItems.add(item);

        item = new NoteItems();
        item.setHeading("2nd Heading");
        item.setDescription("This is the description of second heading.");
        noteItems.add(item);

        item = new NoteItems();
        item.setHeading("3rd Heading");
        item.setDescription("This is the description of third heading.");
        noteItems.add(item);

        item = new NoteItems();
        item.setHeading("4th Heading");
        item.setDescription("This is the description of fourth heading.");
        noteItems.add(item);

        item = new NoteItems();
        item.setHeading("5th Heading");
        item.setDescription("This is the description of fifth heading.");
        noteItems.add(item);

        ArrayAdapter<NoteItems> noteItemsArrayAdapter = new ArrayAdapter<NoteItems>(this, android.R.layout.simple_list_item_1, noteItems);
        myList.setAdapter(noteItemsArrayAdapter);
    }
}
