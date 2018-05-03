package com.example.anujsaini.listdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myList = (ListView) findViewById(R.id.demo_list);

        final ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Hi");
        stringArrayList.add("Welcome");
        stringArrayList.add("To");
        stringArrayList.add("Android");
        stringArrayList.add("Application");
        stringArrayList.add("Development");
        stringArrayList.add("Guide.");

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, stringArrayList);
        myList.setAdapter(stringArrayAdapter);

        // below code is to make a toast on list item click
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(ActivityMain.this, stringArrayList.get(i), Toast.LENGTH_SHORT).show();

            }
        });

    }
}
