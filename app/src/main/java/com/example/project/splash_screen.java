package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class splash_screen extends AppCompatActivity {
    private static final int SPLASH_SCREEN =2000;

    Button GoButton;
    Animation rotate_anim;
    Animation anim_2;
    Animation fade_in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        rotate_anim = (Animation) AnimationUtils.loadAnimation(this,R.anim.rotate_anim);
        fade_in = (Animation) AnimationUtils.loadAnimation(this,R.anim.fade_in);
        GoButton=(Button) findViewById(R.id.GoButton);
        GoButton.setAnimation(fade_in);
        GoButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(splash_screen.this,MainActivity.class);
                startActivity(intent);
                finish();}
        });
    }
}