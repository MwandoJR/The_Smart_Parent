package com.MwandoJrTechnologies.the_smart_parent;


import android.content.Intent;
import android.os.Bundle;

import com.MwandoJrTechnologies.the_smart_parent.NewsFeed.MainActivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}