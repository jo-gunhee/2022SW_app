package com.apple01.apple;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Research_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research4);

        Button btn_research4 = findViewById(R.id.btn_research4);

        Intent intent = getIntent();

//        String ans1 = intent.getExtras().getString("a1"); /*String형*/
//        String ans2 = intent.getExtras().getString("a2"); /*String형*/
//        String ans3 = intent.getExtras().getString("a3"); /*String형*/
//        String ans4 = intent.getExtras().getString("a4"); /*String형*/
        String ans5 = intent.getExtras().getString("a5"); /*String형*/
        String ans6 = intent.getExtras().getString("a6"); /*String형*/

//        TextView an1 = findViewById(R.id.ans_1);
//        TextView an2 = findViewById(R.id.ans_2);
//        TextView an3 = findViewById(R.id.ans_3);
//        TextView an4 = findViewById(R.id.ans_4);
        TextView an5 = findViewById(R.id.ans_5);
        TextView an6 = findViewById(R.id.ans_6);

//        an1.append(ans1);
//        an2.append(ans2);
//        an3.append(ans3);
//        an4.append(ans4);
        an5.append(ans5);
        an6.append(ans6);




        btn_research4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true); // 태스크를 백그라운드로 이동
                finishAndRemoveTask(); // 액티비티 종료 + 태스크 리스트에서 지우기
                System.exit(0);
            }
        });

    }
}
