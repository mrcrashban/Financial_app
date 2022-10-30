package com.example.financial_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnGoAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGoAdd = findViewById(R.id.button6);
        btnGoAdd.setOnClickListener(view -> startMoneyAdd(view));
    }
    public void startMoneyAdd(View view){
        Intent intent = new Intent(this, Moneyadd.class);
        startActivity(intent);
    }
}