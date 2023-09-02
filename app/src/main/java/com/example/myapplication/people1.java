package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class people1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.people1_layout);
        //查阅
        Button check = (Button) findViewById(R.id.check);
        check.setOnClickListener(v -> {
            Intent i = new Intent(people1.this, Check.class);
            startActivity(i);
        });
        //签订
        Button sign = (Button) findViewById(R.id.sign);
        sign.setOnClickListener(v -> {
            Intent i = new Intent(people1.this, sign.class);
            startActivity(i);
        });
        //编辑
        Button edit = (Button) findViewById(R.id.edit);
        edit.setOnClickListener(v -> {
            Intent i = new Intent(people1.this, edit.class);
            startActivity(i);
        });
    }
}
