package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chitral extends AppCompatActivity {

    Button chitral_interested;
    Button map_mainCH;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_chitral);
        chitral_interested = findViewById(R.id.chitral_interested);
        map_mainCH = findViewById(R.id.map_mainCH);
        chitral_interested.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chitral.this,GetChitralDetails.class);
                startActivity(intent);
            }
        });

        map_mainCH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chitral.this,MapsActivityRawChitral.class);
                startActivity(intent);
            }
        });
    }
}