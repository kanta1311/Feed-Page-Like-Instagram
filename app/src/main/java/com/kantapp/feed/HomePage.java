package com.kantapp.feed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {

    private ArrayList postList;
    private RecyclerView post;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        post=(RecyclerView)findViewById(R.id.recycle_homefeed);
        post.setHasFixedSize(true);
        RecyclerView.LayoutManager ListLayoutManager=new LinearLayoutManager(getApplicationContext());
        post.setLayoutManager(ListLayoutManager);


        postList=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            postList.add(i);
        }
        RecyclerView.Adapter adapter=new PostAdapter(postList);
        post.setAdapter(adapter);
    }
}
