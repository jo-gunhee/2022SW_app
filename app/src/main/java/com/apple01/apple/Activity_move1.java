package com.apple01.apple;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_move1 extends AppCompatActivity {


    Button btn_move3;
    TextView text1,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);

//        Intent intent = getIntent();

        btn_move3 = findViewById(R.id.btn_move3);
        text1 = findViewById(R.id.activity_move_text1);
        text2 = findViewById(R.id.activity_move_text2);

//        String name = intent.getExtras().getString("name"); /*String형*/
//        text1.append(name);
//        int age = intent.getExtras().getInt("age"); /*int형*/
//        text2.append(String.valueOf(age));

        btn_move3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activity_move2.class);

                intent.putExtra("name", "홍길동"); /*송신*/
                intent.putExtra("age", 20);

                startActivity(intent);
            }
        });
    }
}
