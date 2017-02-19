package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        ImageView settings_background = (ImageView) findViewById(R.id.settings_background);
        Picasso.with(this).load(R.drawable.setting1).into(settings_background);

        ImageView play_button = (ImageView) findViewById(R.id.play_button);
        Picasso.with(this).load(R.drawable.play_button).into(play_button);

        play_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity_main = new Intent(Settings.this, MainActivity.class);
                startActivity(activity_main);
            }
        });
    }
}
