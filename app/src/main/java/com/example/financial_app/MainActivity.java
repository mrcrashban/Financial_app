package com.example.financial_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnGoAdd, btnGoSub;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGoAdd = findViewById(R.id.button_add);
        btnGoAdd.setOnClickListener(
                v -> {
                    Intent intent = new Intent("com.example.financial_app.Moneyadd");
                    startActivity(intent);
                }
        );
        btnGoSub = findViewById(R.id.button_sub);
        btnGoSub.setOnClickListener(
                v -> {
                    Intent intent = new Intent("com.example.financial_app.Moneysub");
                    startActivity(intent);
                }
        );
    }
}