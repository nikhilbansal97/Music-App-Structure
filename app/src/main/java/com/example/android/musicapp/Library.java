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

public class Library extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        Toast.makeText(this, "Tap on image for Player!", Toast.LENGTH_SHORT).show();

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        ArrayList<String> songs = new ArrayList<>();
        for (int i = 1; i < 11; i++)
            songs.add("Song " + i);

        ArrayAdapter<String> song_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songs);

        ListView songs_view = (ListView) findViewById(R.id.songs_list);

        songs_view.setAdapter(song_adapter);

        ImageView background_top = (ImageView) findViewById(R.id.background_top);
        Picasso.with(this).load(R.drawable.library).into(background_top);
        background_top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main_background = new Intent(Library.this, MainActivity.class);
                startActivity(main_background);
            }
        });
    }
}
