package com.apple01.apple;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);

        Button testbtn1 = findViewById(R.id.btn1);
        Button testbtn2 = findViewById(R.id.btn2);

        testbtn1.setText("안녕하세요");

        testbtn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                testbtn1.setText("bye bye");
            }
        });

        testbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testbtn2.setTextColor(Color.RED);
                testbtn2.setTextColor(Color.parseColor("#FF0000"));
            }
        });
    }
}