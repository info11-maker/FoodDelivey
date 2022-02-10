package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class buttonGetStarted extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_get_started);
        imageView = findViewById(R.id.imageViewHomePage);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(buttonGetStarted.this, MainActivity.class);
                startActivity(intent);
            }
        });
        textView = findViewById(R.id.textViewBtnCreate);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(buttonGetStarted.this, LogInActivity.class);
                startActivity(intent);
            }
        });
    }
}