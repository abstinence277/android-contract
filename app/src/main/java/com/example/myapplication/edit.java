package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class edit extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_layout);

        Button find = (Button) findViewById(R.id.find);
        find.setOnClickListener(this::onClick);

        Button change = (Button) findViewById(R.id.change);
        change.setOnClickListener(v -> {
            change.setText("ok!");
            Intent i = new Intent(edit.this, people1.class);
            startActivity(i);
        });
    }

    private void onClick(View v) {

        EditText in = (EditText) findViewById(R.id.in);
        String in_content = in.getText().toString();
        //
        EditText id = (EditText) findViewById(R.id.id);
        id.setText("作业合同备案编号：" + in_content);

        //
        EditText contract_name = (EditText) findViewById(R.id.contract_name);
        contract_name.setText("作业合同名称：" + "防治合同");
        //
        EditText settime = (EditText) findViewById(R.id.settime);
        settime.setText("防治时间：" + "2022-2077");
        //
        EditText id2 = (EditText) findViewById(R.id.id2);
        id2.setText("防治项目备案编号：" + "123456789");
        //
        EditText jia = (EditText) findViewById(R.id.jia);
        jia.setText("甲方（采购单位）" + "北京市防治企业有限公司");
        //
        EditText yi = (EditText) findViewById(R.id.yi);
        yi.setText("乙方（防治ID号）：" + "987654321");
        //
        EditText medicine = (EditText) findViewById(R.id.medcine_name);
        medicine.setText("使用药剂名称：" + "杀虫剂");
        //
        EditText medicine2 = (EditText) findViewById(R.id.medcine);
        medicine2.setText("使用药剂描述：" + "杀虫");
        //
        EditText planename = (EditText) findViewById(R.id.planename);
        planename.setText("作业飞机名称：" + "飞机1");
        //
        EditText S = (EditText) findViewById(R.id.S);
        S.setText("作业总面积（亩）：" + "1200");
        //
        EditText fee = (EditText) findViewById(R.id.fee);
        fee.setText("费用：" + "1200元");
        //
        EditText province = (EditText) findViewById(R.id.province);
        province.setText("省名称：" + "北京市");
        //
        EditText shi = (EditText) findViewById(R.id.shi);
        shi.setText("市名称：" + "海淀区");
        //
        EditText xian = (EditText) findViewById(R.id.xian);
        xian.setText("县名称：" + "清华东路");
        //
    }
}
