package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Skardu extends AppCompatActivity {

    Button skardu_interested;
    Button map_mainSK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_skardu);
        skardu_interested = findViewById(R.id.skardu_interested);
        map_mainSK = findViewById(R.id.map_mainSK);
        skardu_interested.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Skardu.this,GetSkarduDetails.class);
                startActivity(intent);
            }
        });

        map_mainSK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Skardu.this,MapsActivityRawSkardu.class);
                startActivity(intent);
            }
        });
    }
}