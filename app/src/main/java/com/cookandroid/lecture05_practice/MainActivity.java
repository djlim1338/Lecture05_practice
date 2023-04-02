package com.cookandroid.lecture05_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mainBtnPrac4, mainBtnPrac5, mainBtnPrac6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainBtnPrac4 = (Button) findViewById(R.id.mainBtnPrac4);
        mainBtnPrac5 = (Button) findViewById(R.id.mainBtnPrac5);
        mainBtnPrac6 = (Button) findViewById(R.id.mainBtnPrac6);

        mainBtnPrac4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Prac4.class);
                startActivity(intent);
            }
        });

        mainBtnPrac5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Prac5.class);
                startActivity(intent);
            }
        });

        mainBtnPrac6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Prac6.class);
                startActivity(intent);
            }
        });
    }
}