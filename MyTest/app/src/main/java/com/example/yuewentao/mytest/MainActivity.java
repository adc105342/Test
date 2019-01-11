package com.example.yuewentao.mytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        TextView t=findViewById(R.id.ttt);
    }
}
