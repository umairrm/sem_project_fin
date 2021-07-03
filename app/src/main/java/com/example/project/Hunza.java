package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hunza extends AppCompatActivity {

    Button hunza_interested;
    Button map_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_hunza);
        hunza_interested = findViewById(R.id.hunza_interested);
        hunza_interested.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hunza.this,GetHunzaDetails.class);
                startActivity(intent);
            }
        });

        map_main = findViewById(R.id.map_main);
       map_main.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(Hunza.this,MapsActivityRaw.class);
               startActivity(intent);
           }
       });
    }
}