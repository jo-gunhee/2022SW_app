package com.apple01.apple;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Research_2 extends AppCompatActivity {

    Intent intent;
    String ans1, ans2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research2);

        Button btn_research2 = findViewById(R.id.btn_research2);

        intent = getIntent();

        ans1 = intent.getExtras().getString("a1"); /*String형*/
        ans2 = intent.getExtras().getString("a2"); /*String형*/


        btn_research2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ans3 = (EditText)findViewById(R.id.answer_3);
                EditText ans4 = (EditText)findViewById(R.id.answer_4);

                intent = new Intent(getApplicationContext(), Research_3.class);

//                intent.putExtra("a1", ans1.toString());
//                intent.putExtra("a2", ans2.toString());
                intent.putExtra("a3", ans3.getText());
                intent.putExtra("a4", ans4.getText());

                startActivity(intent);


            }
        });

    }
}
