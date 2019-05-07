package com.example.bai3_layout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TableLayout extends AppCompatActivity {
    Button btnRed, btnBlue, btnGreen, btnClear;
    TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);

        btnBlue     = (Button)      findViewById(R.id.blue);
        btnClear    = (Button)      findViewById(R.id.clear);
        btnGreen    = (Button)      findViewById(R.id.green);
        btnRed      = (Button)      findViewById(R.id.red);
        view        = (TextView)    findViewById(R.id.view);

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setBackgroundResource(R.color.colorRed);
//                view.setBackgroundColor(Color.RED);
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setBackgroundResource(R.color.colorBlue);
//                view.setBackgroundColor(Color.BLUE);
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setBackgroundResource(R.color.colorGreen);
//                view.setBackgroundColor(Color.GREEN);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setBackgroundResource(R.color.colorWhite);
//                view.setBackgroundColor(Color.WHITE);
            }
        });
    }
}
