package com.apple01.apple;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Research_1 extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research1);

        Button btn_research1 = findViewById(R.id.btn_research1);

        btn_research1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ans1 = findViewById(R.id.answer_1).toString();
                String ans2 = findViewById(R.id.answer_2).toString();

                intent = new Intent(getApplicationContext(), Research_2.class);

                intent.putExtra("a1", ans1); /*송신*/
                intent.putExtra("a2", ans2);

                startActivity(intent);


            }
        });

    }
}
