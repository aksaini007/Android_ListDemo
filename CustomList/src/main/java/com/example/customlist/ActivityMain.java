package com.example.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class ActivityMain extends AppCompatActivity {

    ListView myList;
    ArrayList<PostItem> postItemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myList = (ListView) findViewById(R.id.myList);
        postItemArrayList = new ArrayList<>();

        PostItem postItem = new PostItem();
        postItem.setId(1);
        postItem.setChannelLogoResId(R.drawable.channel_logo);
        postItem.setChannelName("Microsoft");
        postItem.setDateTime("03-May");
        postItem.setHeading("This is 1st test heading");
        postItem.setPostResId(R.drawable.post);
        postItem.setDescription("This is the test description of first post...");
        postItem.setLink("www.microsoft.com");
        postItem.setLikes("2k");
        postItem.setComments("700 Comments . 107 Shares");

        postItemArrayList.add(postItem);


        postItem = new PostItem();
        postItem.setId(2);
        postItem.setChannelLogoResId(R.drawable.channel_logo);
        postItem.setChannelName("Microsoft");
        postItem.setDateTime("03-May");
        postItem.setHeading("This is 2nd test heading");
        postItem.setPostResId(R.drawable.post);
        postItem.setDescription("This is the test description of second post...");
        postItem.setLink("www.microsoft.com");
        postItem.setLikes("1k");
        postItem.setComments("500 Comments . 80 Shares");

        postItemArrayList.add(postItem);

        CustomPostListArrayAdapter customPostListArrayAdapter = new CustomPostListArrayAdapter(this,R.layout.custom_list_item, postItemArrayList);

        myList.setAdapter(customPostListArrayAdapter);
    }
}
