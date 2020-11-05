package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bai2(View view) {
        Intent intent = new Intent(this,bai2.class);
        startActivity(intent);
    }

    public void bai1(View view) {
        Intent intent = new Intent(this,bai1.class);
        startActivity(intent);
    }

    public void bai3(View view) {
        Intent intent = new Intent(this,bai3.class);
        startActivity(intent);
    }

    public void bai4(View view) {
        Intent intent = new Intent(this,bai4.class);
        startActivity(intent);
    }
}