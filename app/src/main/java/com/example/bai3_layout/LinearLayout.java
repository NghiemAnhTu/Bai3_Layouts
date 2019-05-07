package com.example.bai3_layout;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class LinearLayout extends AppCompatActivity {

    RadioButton rdRed, rdBlue, rdGreen;
    TextView view;
    Button btnSet, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linearlayout);

        rdBlue      = (RadioButton) findViewById(R.id.blue);
        rdRed       = (RadioButton) findViewById(R.id.red);
        rdGreen     = (RadioButton) findViewById(R.id.green);
        btnReset    = (Button) findViewById(R.id.btnClear);
        btnSet      = (Button) findViewById(R.id.btnSet);
        view        = (TextView) findViewById(R.id.view);

        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( rdBlue.isChecked() ){
                    view.setBackgroundColor(Color.BLUE);
                }else if ( rdGreen.isChecked() ){
                    view.setBackgroundColor(Color.GREEN);
                }else if ( rdRed.isChecked() ){
                    view.setBackgroundColor(Color.RED);
                }else{
                    Toast.makeText(LinearLayout.this, "vui lòng chọn màu", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setBackgroundColor(Color.WHITE);
            }
        });
    }
}
