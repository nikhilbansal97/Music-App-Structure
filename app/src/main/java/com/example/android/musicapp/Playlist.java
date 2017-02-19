package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        Toast.makeText(this, "Tap on image for Player", Toast.LENGTH_SHORT).show();

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        ImageView playlist_background = (ImageView) findViewById(R.id.playlist_background);
        ImageView playlist_image = (ImageView) findViewById(R.id.playlist_image);

        Picasso.with(this).load(R.drawable.playlist_image).into(playlist_background);
        Picasso.with(this).load(R.drawable.album_art).into(playlist_image);

        playlist_background.setImageAlpha(30);

        ArrayList<String> playlist_list = new ArrayList<>();
        for (int i = 1; i < 11; i++)
            playlist_list.add("Song " + i);

        ArrayAdapter<String> playlist_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, playlist_list);
        ListView playlist_view = (ListView) findViewById(R.id.playlist_list);
        playlist_view.setAdapter(playlist_adapter);

        playlist_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main_activity = new Intent(Playlist.this, MainActivity.class);
                startActivity(main_activity);
            }
        });

    }
}
