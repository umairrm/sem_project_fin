package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class pack1_chitral extends AppCompatActivity {
    Button chitral_submit1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_pack1_chitral);
        chitral_submit1 = findViewById(R.id.hunza_submit1);
        chitral_submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pack1_chitral.this,GetChitralDetails.class);
                startActivity(intent);
                Toast.makeText(pack1_chitral.this,"Package 1 Selected",Toast.LENGTH_LONG).show();
            }
        });
    }
}