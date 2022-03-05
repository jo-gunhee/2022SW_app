package com.apple01.apple;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_chess_rule extends AppCompatActivity implements View.OnClickListener {

    Button c1,c2,c3,c4,c5,c6;
    TextView t1,t2,t3,t4,t5,t6 ;
    ScrollView scrollView;
    int[] viewLocation, scrollLocation, v,s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.project_07);

        init();



    }



    void init(){

        scrollView = findViewById(R.id.scroll);

        c1 = findViewById(R.id.content1);
        c2 = findViewById(R.id.content2);
        c3 = findViewById(R.id.content3);
        c4 = findViewById(R.id.content4);
        c5 = findViewById(R.id.content5);
        c6 = findViewById(R.id.content6);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);

        viewLocation = new int[2];
        scrollLocation = new int[2];
    }
//
//    public int[] getViewLocation(View view){
//        view.getLocationOnScreen(viewLocation);
//        return viewLocation;
//    }
//
//    public int[] getScrollViewLocation(View view){
//        scrollView.getLocationOnScreen(scrollLocation);
//        return scrollLocation;
//    }


    public void onClick(View view){
        switch (view.getId()){
            case R.id.content1:
                ObjectAnimator animation = ObjectAnimator.ofFloat(view, "translationY", 100f);
                animation.setDuration(1000);
                animation.start();

                break;
            case R.id.content2:

                break;
            case R.id.content3:

                break;
            case R.id.content4:

                break;
            case R.id.content5:

                break;
            case R.id.content6:

                break;

        }
    }
}
