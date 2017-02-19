package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        ImageView pause = (ImageView) findViewById(R.id.pause);
        ImageView back = (ImageView) findViewById(R.id.back_button);
        ImageView next = (ImageView) findViewById(R.id.next);
        ImageView settings = (ImageView) findViewById(R.id.settings);
        ImageView equalizer = (ImageView) findViewById(R.id.equalizer);
        ImageView main_image = (ImageView) findViewById(R.id.main_image);
        Picasso.with(this).load(R.drawable.album_art).into(main_image);

        pause.setImageAlpha(210);
        back.setImageAlpha(180);
        next.setImageAlpha(180);
        settings.setImageAlpha(150);
        equalizer.setImageAlpha(150);

        Button library = (Button) findViewById(R.id.library);
        Button playlist = (Button) findViewById(R.id.playlist_button);


        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent library_intent = new Intent(MainActivity.this, Library.class);
                startActivity(library_intent);
            }
        });

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlist_activity = new Intent(MainActivity.this, Playlist.class);
                startActivity(playlist_activity);
            }
        });

        equalizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent equalizer_activity = new Intent(MainActivity.this, Equalizer.class);
                startActivity(equalizer_activity);
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settings_activity = new Intent(MainActivity.this, Settings.class);
                startActivity(settings_activity);
            }
        });

    }
}
