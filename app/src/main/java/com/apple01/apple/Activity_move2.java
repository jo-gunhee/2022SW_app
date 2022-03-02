package com.apple01.apple;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_move2 extends AppCompatActivity {

    Button btn_move4;
    TextView text3, text4;
    int n;

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        n = n+1;
        if(n == 2){

            moveTaskToBack(true); // 태스크를 백그라운드로 이동
            finishAndRemoveTask(); // 액티비티 종료 + 태스크 리스트에서 지우기

            System.exit(0);
        }else{
            Toast.makeText(getApplicationContext(), "한번 더 누르면 종료됩니다.", Toast.LENGTH_LONG).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move2);

        Intent intent = getIntent();

        btn_move4 = findViewById(R.id.btn_move4);
        text3 = findViewById(R.id.activity_move_text3);
        text4 = findViewById(R.id.activity_move_text4);

        String name = intent.getExtras().getString("name"); /*String형*/
        text3.append(name);
        int age = intent.getExtras().getInt("age"); /*int형*/
        text4.append(String.valueOf(age));

        btn_move4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activity_move1.class);

                intent.putExtra("name", "조건희"); /*송신*/
                intent.putExtra("age", 21);

                startActivity(intent);
            }
        });



    }
}
