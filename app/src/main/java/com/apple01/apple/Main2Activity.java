package com.apple01.apple;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    TextView text_car;
    Button btn_up_speed, btn_down_speed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actuvuty_car);

        ImageView meter = findViewById(R.id.meter);
        text_car = findViewById(R.id.text_car);
        btn_up_speed = findViewById(R.id.btn_car2);
        btn_down_speed = findViewById(R.id.btn_car3);


        Car mycar1 = new Car();
        mycar1.setSpeed(50);
        mycar1.setModel("m3");
        mycar1.setColor("red");

        text_car.setText(mycar1.getColor() + " " + mycar1.getModel() + "자동차의 속력은 " + mycar1.getSpeed() + "km 입니다.");
        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_car2:

                        if (mycar1.getSpeed() == 100) {
                            Toast.makeText(getApplicationContext(), "더 이상 가속 불가", Toast.LENGTH_SHORT).show();
                        } else {
                            mycar1.upSpeed();
                            if (mycar1.getSpeed() >= 70) meter.setImageResource(R.drawable.fast);
                            else if(mycar1.getSpeed() >= 30) meter.setImageResource(R.drawable.middle);
                            else meter.setImageResource(R.drawable.slow);
                            text_car.setText(mycar1.getColor() + " " + mycar1.getModel() + " 자동차의 속력은 " + mycar1.getSpeed() + "km 입니다.");
                        }
                        break;

                    case R.id.btn_car3:
                        if (mycar1.getSpeed() == 0) {
                            Toast.makeText(getApplicationContext(), "더 이상 감속 불가", Toast.LENGTH_SHORT).show();
                        } else {
                            mycar1.downSpeed();
                            if (mycar1.getSpeed() >= 70) meter.setImageResource(R.drawable.fast);
                            else if(mycar1.getSpeed() >= 30) meter.setImageResource(R.drawable.middle);
                            else meter.setImageResource(R.drawable.slow);
                            text_car.setText(mycar1.getColor() + " " + mycar1.getModel() + " 자동차의 속력은 " + mycar1.getSpeed() + "km 입니다.");
                        }
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + v.getId());
                }
            }
        };
        btn_up_speed.setOnClickListener(onClickListener);
        btn_down_speed.setOnClickListener(onClickListener);


//        btn_up_speed.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(mycar1.getSpeed() == 100){
//                    Toast.makeText(getApplicationContext(), "더 이상 가속 불가", Toast.LENGTH_SHORT).show();
//                }else {
//                    mycar1.upSpeed();
//                    int speed = mycar1.getSpeed();
//                    text_car.setText(mycar1.getColor() + " " + mycar1.getModel() + " 자동차의 속력은 " + speed + "km 입니다.");
//                }
//            }
//        });
//
//        btn_down_speed.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(mycar1.getSpeed() == 0){
//                    Toast.makeText(getApplicationContext(), "더 이상 감속 불가", Toast.LENGTH_SHORT).show();
//                }else {
//                    mycar1.downSpeed();
//                    int speed = mycar1.getSpeed();
//                    text_car.setText(mycar1.getColor() + " " + mycar1.getModel() + " 자동차의 속력은 " + speed + "km 입니다.");
//                }
//            }
//        });

    }

}