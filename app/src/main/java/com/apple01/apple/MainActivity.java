package com.apple01.apple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    calculator cal;

    boolean isDot;
    boolean isPreview;
    boolean isequal;


    TextView textView;
    TextView textView2;


    int size;
    String result;

    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;


    Button btn_reset;
    Button btn_back;
    Button btn_div_else;
    Button btn_div;
    Button btn_mul;
    Button btn_minus;
    Button btn_plus;
    Button btn_equal;
    Button btn_dot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_1_calculator);

        cal = new calculator();
        size = 0;

        isequal = false;
        textView = findViewById(R.id.textView_1);
        textView2 = findViewById(R.id.textView_2);

        this.InitializeButton();
    }


    public void InitializeButton() {
        btn0 = (Button) findViewById(R.id._0);
        btn1 = (Button) findViewById(R.id._1);
        btn2 = (Button) findViewById(R.id._2);
        btn3 = (Button) findViewById(R.id._3);
        btn4 = (Button) findViewById(R.id._4);
        btn5 = (Button) findViewById(R.id._5);
        btn6 = (Button) findViewById(R.id._6);
        btn7 = (Button) findViewById(R.id._7);
        btn8 = (Button) findViewById(R.id._8);
        btn9 = (Button) findViewById(R.id._9);

        btn_reset = (Button) findViewById(R.id.reset);
        btn_back = (Button) findViewById(R.id.back);
        btn_div_else = (Button) findViewById(R.id.div_else);
        btn_div = (Button) findViewById(R.id.div);
        btn_mul = (Button) findViewById(R.id.mul);
        btn_minus = (Button) findViewById(R.id.minus);
        btn_plus = (Button) findViewById(R.id.plus);
        btn_equal = (Button) findViewById(R.id.equal);
        btn_dot = (Button) findViewById(R.id.dot);

        btn0.setOnClickListener(numClickListener);
        btn1.setOnClickListener(numClickListener);
        btn2.setOnClickListener(numClickListener);
        btn3.setOnClickListener(numClickListener);
        btn4.setOnClickListener(numClickListener);
        btn5.setOnClickListener(numClickListener);
        btn6.setOnClickListener(numClickListener);
        btn7.setOnClickListener(numClickListener);
        btn8.setOnClickListener(numClickListener);
        btn9.setOnClickListener(numClickListener);

        btn_reset.setOnClickListener(markClickListener);
        btn_back.setOnClickListener(markClickListener);
        btn_div_else.setOnClickListener(markClickListener);
        btn_div.setOnClickListener(markClickListener);
        btn_mul.setOnClickListener(markClickListener);
        btn_minus.setOnClickListener(markClickListener);
        btn_plus.setOnClickListener(markClickListener);
        btn_equal.setOnClickListener(markClickListener);
        btn_dot.setOnClickListener(markClickListener);

    }

    Button.OnClickListener numClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (isequal == true) {
                textView.setText("");
                textView2.setText("");
                isequal = false;
            }
            switch (v.getId()) {
                case R.id._0:
                    textView.append("0");
                    break;
                case R.id._1:
                    textView.append("1");
                    break;
                case R.id._2:
                    textView.append("2");
                    break;
                case R.id._3:
                    textView.append("3");
                    break;
                case R.id._4:
                    textView.append("4");
                    break;
                case R.id._5:
                    textView.append("5");
                    break;
                case R.id._6:
                    textView.append("6");
                    break;
                case R.id._7:
                    textView.append("7");
                    break;
                case R.id._8:
                    textView.append("8");
                    break;
                case R.id._9:
                    textView.append("9");
                    break;
            }
        }
    };

    Button.OnClickListener markClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (isequal == true) {
                textView.setText(textView2.getText());
                textView2.setText("");
                isequal = false;
            }

            switch (view.getId()) {

                case R.id.plus:
                    textView.append(" + ");
                    isPreview = true;
                    break;
                case R.id.minus:
                    textView.append(" - ");
                    isPreview = true;
                    break;
                case R.id.mul:
                    textView.append(" * ");
                    isPreview = true;
                    break;
                case R.id.div:
                    textView.append(" / ");
                    isPreview = true;
                    break;
                case R.id.div_else:
                    textView.append(" % ");
                    isPreview = true;
                    break;
                case R.id.reset:
                    textView.setText("");
                    textView2.setText("");
                    cal = new calculator();
                    isPreview = false;
                    break;

                case R.id.back:
                    size = textView.getText().length();
                    if (size != 0)
                        textView.setText(textView.getText().toString().substring(0, size - 1));

                    if (size > 1) {
                        if (cal.checkN(textView.getText().toString().substring(size - 2)))
                            preview();
                        else {
                            isPreview = false;
                            textView2.setText("");
                        }
                    }

                    break;

                case R.id.dot:
                    textView.append(".");
                    isDot = true;
                    break;


                case R.id.equal:
                    result = textView.getText().toString();
                    double r = cal.process(result);

                    if (!isDot)
                        textView2.setText(String.valueOf((int) r));
                    else
                        textView2.setText(String.valueOf(r));
                    isDot = false;
                    isPreview = false;
                    isequal = true;
                    break;
            }

        }
    };

    private void preview() {
        if (isPreview) {
            result = textView.getText().toString();
            double r = cal.process(result);

            if (!isDot) {
                textView2.setText(String.valueOf((int) r));
            } else {
                textView2.setText(String.valueOf(r));
            }
        }
    }

}
