package com.example.stirringminds;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;



public class splashscreen extends AppCompatActivity {
    ImageView imageView;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

     imageView = findViewById(R.id.imageView);
        Animation slideanimation = AnimationUtils.loadAnimation(this,R.anim.slide);
        imageView.startAnimation(slideanimation);

        Handler handler = new Handler();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        };
        handler.postDelayed(r, 3000);


    }
}