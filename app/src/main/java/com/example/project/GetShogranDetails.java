package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class GetShogranDetails extends AppCompatActivity {

    EditText shogran_name, shogran_email, shogran_phone;
    Button shogran_pack1,shogran_submit;
    shogran_sqldb myshogran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_shogran_details);
        shogran_name = findViewById(R.id.shogran_name);
        shogran_email = findViewById(R.id.shogran_email);
        shogran_phone = findViewById(R.id.shogran_phone);
        shogran_submit = findViewById(R.id.shogran_submit);
        shogran_pack1 = findViewById(R.id.package1);
        shogran_pack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GetShogranDetails.this,pack1_shogran.class);
                startActivity(intent);
            }
        });

        myshogran = new shogran_sqldb(this);

        shogran_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(shogran_name.length()==0){
                    shogran_name.setError("Enter name");
                }
                else if(shogran_email.length()==0){
                    shogran_email.setError("Enter email");
                }
                else if(shogran_phone.length()==0){
                    shogran_phone.setError("Enter phone number");
                }
                else {
                    String sh_name = shogran_name.getText().toString();
                    String sh_email = shogran_email.getText().toString();
                    String sh_phone = shogran_phone.getText().toString();
                    boolean checksave = myshogran.insert_sho_data( sh_name , sh_email, sh_phone);
                    if ( checksave == true ){
                        Toast.makeText(GetShogranDetails.this, "Data saved successfully ", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(GetShogranDetails.this, "Data not saved ", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}