package com.example.bluepop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    RecyclerView recyclerView;
    ArrayList<Shoes> list;
    RecyclerAdapter recyclerAdapter;

    void initViews(){

        recyclerView = findViewById(R.id.recyclerView);
        list = new ArrayList<>();

        recyclerAdapter = new RecyclerAdapter(this, R.layout.list_item, list);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        //GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        //recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setAdapter(recyclerAdapter);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Shoes shoes = list.get(position);
        Intent intent = new Intent(MainActivity.this, DesActivity.class);
        intent.putExtra("keyShoes",shoes);
        startActivity(intent);
    }
}
