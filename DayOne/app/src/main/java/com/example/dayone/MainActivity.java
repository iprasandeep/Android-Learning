package com.example.dayone;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView = findViewById(R.id.txtview);
//        textView.setText("Hey, Prasandeep!");
//        TextView tv = findViewById(R.id.txtview);
//        tv.setText("Prasandeep, Welcome to Delhi!");

//        Button button = findViewById(R.id.button);
//        button.setOnClickListener(v -> {
//            Log.d("MR.bool", "Button was clicked ");
//            // Do something in response to button click
//        });
    }
}
