package com.example.financial_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Moneyadd extends AppCompatActivity {

    private Button btnBack;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moneyadd);
        btnBack = findViewById(R.id.imageButton3);
        btnBack.setOnClickListener(view -> goToMain(view) );
    }
    public void goToMain (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}