package com.example.myapplication;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, people2.class);
            startActivity(i);
        });

        //按钮监听+页面跳转
        Button button2 = (Button) findViewById(R.id.button2);//指定的按钮
        button2.setOnClickListener(v -> {
            //目标Activity
            Intent i = new Intent(MainActivity.this, people1.class);
            startActivity(i);
        });
    }
}
