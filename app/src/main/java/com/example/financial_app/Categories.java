package com.example.financial_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ImageButton;

public class Categories extends AppCompatActivity {

    private ImageButton back_button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        back_button = findViewById(R.id.imageButton3);
        back_button.setOnClickListener(
                v -> {
                    Intent intent = new Intent(this, MainActivity.class);
                    startActivity(intent);
                }
        );
    }
}