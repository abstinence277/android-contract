package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class people2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.people2_layout);

        //查阅
        Button check2 = (Button) findViewById(R.id.check2);
        check2.setOnClickListener(v -> {
            Intent i = new Intent(people2.this, Check.class);
            startActivity(i);
        });
        //签订
        Button sign2 = (Button) findViewById(R.id.sign2);
        sign2.setOnClickListener(v -> {
            Intent i = new Intent(people2.this, sign2.class);
            startActivity(i);
        });
        //编辑
        Button edit2 = (Button) findViewById(R.id.edit2);
        edit2.setOnClickListener(v -> {
            Intent i = new Intent(people2.this, edit.class);
            startActivity(i);
        });
    }
}
