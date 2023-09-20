package com.example.slide7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AnhBa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anhba);
        TextView textView = findViewById(R.id.anhBa);
        Intent intent = this.getIntent();
        textView.setText(intent.getStringExtra(Intent.EXTRA_TEXT));
    }

    public void onBack(View view) {
        onBackPressed();
    }
}