package com.example.anujsaini.listdemo;

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

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Hi");
        stringArrayList.add("Welcome");
        stringArrayList.add("To");
        stringArrayList.add("Android");
        stringArrayList.add("Application");
        stringArrayList.add("Development");
        stringArrayList.add("Guide.");

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, stringArrayList);
        myList.setAdapter(stringArrayAdapter);
    }
}
