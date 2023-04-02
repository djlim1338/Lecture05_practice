package com.cookandroid.lecture05_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Prac6 extends AppCompatActivity {

    LinearLayout layB, layM, layS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prac6);

        layB = (LinearLayout) findViewById(R.id.layout_B);
        layM = (LinearLayout) findViewById(R.id.layout_M);
        layS = (LinearLayout) findViewById(R.id.layout_S);

        layB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int size = 250;
                String displayStr = "width[" + size + "] / height[" + size + "]";
                Toast.makeText(getApplicationContext(), displayStr, Toast.LENGTH_SHORT).show();
            }
        });

        layM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int size = 150;
                String displayStr = "width[" + size + "] / height[" + size + "]";
                Toast.makeText(getApplicationContext(), displayStr, Toast.LENGTH_SHORT).show();
            }
        });

        layS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int size = 50;
                String displayStr = "width[" + size + "] / height[" + size + "]";
                Toast.makeText(getApplicationContext(), displayStr, Toast.LENGTH_SHORT).show();
            }
        });
    }
}