package com.example.bluepop.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bluepop.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DesActivity extends AppCompatActivity {

    @BindView(R.id.buttonBuy)
    Button btnBuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_des);

        ButterKnife.bind(this);
        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DesActivity.this,PaymentActivity.class);
                startActivity(intent);
            }
        });
    }
}
