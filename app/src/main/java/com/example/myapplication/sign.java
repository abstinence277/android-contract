package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.net.CookieHandler;
import java.util.Calendar;

public class sign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_layout);
        Button sign = (Button) findViewById(R.id.summit1);
        sign.setOnClickListener(v -> {
            Intent intent=new Intent();
            intent.setClassName(this,"com.example.myapplication.details");
            EditText time=(EditText) findViewById(R.id.time);
            time.setText("2021-07-21");
            //组件name的内容传参
            EditText name=(EditText) findViewById(R.id.name);
            String name_content=name.getText().toString();
            intent.putExtra("name",name_content);
            //乙方传参
            EditText name2=(EditText) findViewById(R.id.name2);
            String name2_content=name2.getText().toString();
            intent.putExtra("name2",name2_content);
            //地点传参
            EditText place=(EditText) findViewById(R.id.place);
            String place_content=place.getText().toString();
            intent.putExtra("place",place_content);

            startActivity(intent);
        });
    }
}
