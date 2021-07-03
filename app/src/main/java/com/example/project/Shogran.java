package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Shogran extends AppCompatActivity {

    Button shogran_interested;
    Button map_mainSH;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_shogran);
        shogran_interested = findViewById(R.id.shogran_interested);
        map_mainSH = findViewById(R.id.map_mainSH);
        shogran_interested.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Shogran.this,GetShogranDetails.class);
                startActivity(intent);
            }
        });

        map_mainSH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Shogran.this,MapsActivityRawShogran.class);
                startActivity(intent);
            }
        });
    }
}