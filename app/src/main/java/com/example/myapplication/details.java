package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class details extends AppCompatActivity{

    Button summit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_layout);
        //接受传参内容name并设置为组件name_jia的内容
        TextView name_jia=(TextView) findViewById(R.id.getname);
        String name_jia_content=getIntent().getStringExtra("name");
        name_jia.setText("甲方（采购单位）:"+name_jia_content);
        //传参乙
        TextView name_yi=(TextView) findViewById(R.id.getname2);
        String name_yi_content=getIntent().getStringExtra("name2");
        name_yi.setText("乙方（作业单位）"+name_yi_content);
        //传参地点
        TextView place=(TextView) findViewById(R.id.getplace);
        String place_content=getIntent().getStringExtra("place");
        place.setText("签订地点:"+place_content);
        //

        //设置点击按钮后内容变为“OK”
        Button correct = (Button) findViewById(R.id.summit2);
        correct.setOnClickListener(v -> {
            correct.setText("ok!");
            Intent i = new Intent(details.this, people1.class);
            startActivity(i);
        });
    }
}
