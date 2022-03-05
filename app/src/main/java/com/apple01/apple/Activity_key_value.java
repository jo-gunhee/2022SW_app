package com.apple01.apple;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_key_value extends AppCompatActivity implements View.OnClickListener {

    Button btn_get, btn_set;
    EditText set_key, set_val, get_key;
    TextView get_val;
    Context mContext;
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_value);

        mContext = this;
        init(mContext);

        mToast(mContext, "on Create");
        Toast.makeText(mContext, "시작", Toast.LENGTH_SHORT).show();


    }

    void mToast(Context mContext, String text){
        Toast.makeText(mContext, text, Toast.LENGTH_SHORT).show();
    }


    void init(Context ctx){
        sharedPref = this.getPreferences(Context.MODE_PRIVATE);
        editor = sharedPref.edit();


        btn_set = findViewById(R.id.btn_set);
        btn_set.setOnClickListener((View.OnClickListener)ctx);

        set_key = findViewById(R.id.set_key);
        set_val = findViewById(R.id.set_val);

        btn_get = findViewById(R.id.btn_get);
        btn_get.setOnClickListener((View.OnClickListener)ctx);

        get_key = findViewById(R.id.get_key);
        get_val = findViewById(R.id.get_val);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_set:
                editor.putInt(set_key.getText().toString(), Integer.parseInt(set_val.getText().toString()));
                editor.apply();
                break;
            case R.id.btn_get:
                int value = sharedPref.getInt(get_key.getText().toString(), 0);
                get_val.setText(Integer.toString(value));
                break;
        }
    }
}
