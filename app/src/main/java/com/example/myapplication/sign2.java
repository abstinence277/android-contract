package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class sign2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign2_layout);
        Button sign = (Button) findViewById(R.id.summit3);
        sign.setOnClickListener(v -> {
            Intent i = new Intent(sign2.this, details.class);
            startActivity(i);
        });
    }
}
