package com.test.architecture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnStart; btnStart.setOnClickListener(view ->{
        Intent intent = new Intent( this, SecondActivity.class);
        startActivity(intent);
    })
    Button btnStart2; btnStart2.setOnClickListener(view ->

    {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    })


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart = findViewById(R.id.btnStart);

         btnStart2 = findViewById(R.id.btnStart2);

    }
}