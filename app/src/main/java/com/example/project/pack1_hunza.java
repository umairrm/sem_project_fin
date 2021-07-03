package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class pack1_hunza extends AppCompatActivity {

    Button hunza_submit1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_pack1_hunza);
        hunza_submit1 = findViewById(R.id.hunza_submit1);
        hunza_submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pack1_hunza.this,GetHunzaDetails.class);
                startActivity(intent);
                Toast.makeText(pack1_hunza.this,"Package 1 Selected",Toast.LENGTH_LONG).show();
            }
        });
    }
}