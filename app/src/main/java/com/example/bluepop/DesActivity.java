package com.example.bluepop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_des);

        Intent rcv = getIntent();
        Shoes shoes = (Shoes) rcv.getSerializableExtra("keyShoes");


    }
}
