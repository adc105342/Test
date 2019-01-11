package com.example.yuewentao.mytest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;

import android.widget.TextView;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "sdfjasdfhx新加", Toast.LENGTH_SHORT).show();
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        TextView t=findViewById(R.id.ttt);
        Toast.makeText(this, "sdfjasdfhx新加的Toast", Toast.LENGTH_SHORT).show();
        t.setText("水电费和你家啥地方呢");
        t.setTextColor(Color.BLACK);
        t.setText("新提交");
        t.setText("新提交66666");
        t.setText("新提交1111");
        t.setText("新提交2222");
        t.setText("新提交88888");
        t.setText("新提交99999");
        t.setText("新提交155151");
        t.setText("新提交855456");

    }
}
