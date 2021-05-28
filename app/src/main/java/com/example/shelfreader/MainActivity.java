package com.example.shelfreader;

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

    // Launch the shelf reader activity
    public void launchReader(View v) {
        Intent i = new Intent(this, ShelfReader.class);
        startActivity(i);
    }

    // Launch the log history activity
    public void launchLog(View v) {
        Intent i = new Intent(this, ShelfLog.class);
        startActivity(i);
    }
}