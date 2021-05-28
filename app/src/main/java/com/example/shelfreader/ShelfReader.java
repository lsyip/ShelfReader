package com.example.shelfreader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ShelfReader extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelf_reader);
    }

    /* TODO:
       1. Launch camera
       2. Read call numbers & put into array
       3. Sort array
       4. Mark the ones that are out of place
     */
}