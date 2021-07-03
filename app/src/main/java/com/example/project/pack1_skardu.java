package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class pack1_skardu extends AppCompatActivity {
    Button skardu_submit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_pack1_skardu);
        skardu_submit1 = findViewById(R.id.hunza_submit1);
        skardu_submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pack1_skardu.this,GetSkarduDetails.class);
                startActivity(intent);
                Toast.makeText(pack1_skardu.this,"Package 1 Selected",Toast.LENGTH_LONG).show();
            }
        });
    }
}