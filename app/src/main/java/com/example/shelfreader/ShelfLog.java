package com.example.shelfreader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ShelfLog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelf_log2);
    }

    /* TODO:
       Store history of what has been shelf read recently
       Data: Shelf name, to... from read, date
       Events: Add, delete, edit
     */
}