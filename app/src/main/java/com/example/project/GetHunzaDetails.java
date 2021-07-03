package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class GetHunzaDetails extends AppCompatActivity {

    EditText hunza_name, hunza_email, hunza_phone;
    Button hun_pack1,hunza_submit;
    hunza_sqldb myhunza;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_get_hunza_details);
        hunza_name = findViewById(R.id.hunza_name);
        hunza_email = findViewById(R.id.hunza_email);
        hunza_phone = findViewById(R.id.hunza_phone);
        hunza_submit=  findViewById(R.id.hunza_submit);
        hun_pack1 = findViewById(R.id.package1);
        hun_pack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GetHunzaDetails.this,pack1_hunza.class);
                startActivity(intent);
            }
        });
        myhunza = new hunza_sqldb(this);

        hunza_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(hunza_name.length()==0){
                    hunza_name.setError("Enter name");
                }
                else if(hunza_email.length()==0){
                    hunza_email.setError("Enter email");
                }
                else if(hunza_phone.length()==0){
                    hunza_phone.setError("Enter phone number");
                }
                else {
                    String h_name = hunza_name.getText().toString();
                    String h_email = hunza_email.getText().toString();
                    String h_phone = hunza_phone.getText().toString();
                    boolean checksave = myhunza.insert_hun_data( h_name , h_email, h_phone);
                    if ( checksave == true ){
                        Toast.makeText(GetHunzaDetails.this, "Data saved successfully ", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(GetHunzaDetails.this, "Data not saved ", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}