package com.apple01.apple;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Research_3 extends AppCompatActivity {

    Intent intent;
    String ans1, ans2, ans3, ans4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research3);

        Button btn_research3 = findViewById(R.id.btn_research3);

        intent = getIntent();

        ans1 = intent.getExtras().getString("a1"); /*String형*/
        ans2 = intent.getExtras().getString("a2"); /*String형*/
        ans3 = intent.getExtras().getString("a3"); /*String형*/
        ans4 = intent.getExtras().getString("a4"); /*String형*/


        btn_research3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ans5 = (EditText)findViewById(R.id.answer_5);
                EditText ans6 = (EditText)findViewById(R.id.answer_6);

                intent = new Intent(getApplicationContext(), Research_4.class);

//                intent.putExtra("a1", ans1.toString());
//                intent.putExtra("a2", ans2.toString());
//                intent.putExtra("a3", ans3.toString());
//                intent.putExtra("a4", ans4.toString());
                intent.putExtra("a5", ans5.getText());
                intent.putExtra("a6", ans6.getText());

                startActivity(intent);


            }
        });

    }
}
