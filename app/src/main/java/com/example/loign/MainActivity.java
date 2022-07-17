package com.example.loign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent goto_SignUp = new Intent(MainActivity.this, SignUp.class);
        startActivity(goto_SignUp);
    }
}