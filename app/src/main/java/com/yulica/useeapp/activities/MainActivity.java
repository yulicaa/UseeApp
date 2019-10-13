package com.yulica.useeapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.yulica.useeapp.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handlerClickFilmFragment(View view) {
        Intent intent = new Intent(this, FilmActivity.class);
        startActivity(intent);
    }

    public void handlerClickDramaFragment(View view) {
        Intent intent = new Intent(this, DramaActivity.class);
        startActivity(intent);
    }

    public void handlerClickRateFragment(View view) {
        Intent intent = new Intent(this, RateActivity.class);
        startActivity(intent);
    }
}
