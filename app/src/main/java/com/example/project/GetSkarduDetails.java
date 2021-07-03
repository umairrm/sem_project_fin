package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class GetSkarduDetails extends AppCompatActivity {

    EditText skardu_name, skardu_email, skardu_phone;
    Button skardu_pack1,skardu_submit;
    skardu_sqldb myskardu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_get_skardu_details);
        skardu_name = findViewById(R.id.skardu_name);
        skardu_email = findViewById(R.id.skardu_email);
        skardu_phone = findViewById(R.id.skardu_phone);
        skardu_submit = findViewById(R.id.skardu_submit);
        skardu_pack1 = findViewById(R.id.package1);
        skardu_pack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GetSkarduDetails.this,pack1_skardu.class);
                startActivity(intent);
            }
        });
        myskardu = new skardu_sqldb(this);

        skardu_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(skardu_name.length()==0){
                    skardu_name.setError("Enter name");
                }
                else if(skardu_email.length()==0){
                    skardu_email.setError("Enter email");
                }
                else if(skardu_phone.length()==0){
                    skardu_phone.setError("Enter phone number");
                }
                else {
                    String sk_name = skardu_name.getText().toString();
                    String sk_email = skardu_email.getText().toString();
                    String sk_phone = skardu_phone.getText().toString();
                    boolean checksave = myskardu.insert_ska_data( sk_name , sk_email, sk_phone);
                    if ( checksave == true ){
                        Toast.makeText(GetSkarduDetails.this, "Data saved successfully ", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(GetSkarduDetails.this, "Data not saved ", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}