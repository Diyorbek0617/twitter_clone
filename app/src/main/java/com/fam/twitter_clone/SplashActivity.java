package com.fam.twitter_clone;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @SuppressLint("Range")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ImageView  vl_note=findViewById(R.id.iv_note);
        vl_note.animate().setDuration(2000).alpha(2f).withStartAction(() -> {
            Intent i=new Intent(this,MainActivity.class);
            startActivity(i);
            //overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        finish();
        });
    }
}
