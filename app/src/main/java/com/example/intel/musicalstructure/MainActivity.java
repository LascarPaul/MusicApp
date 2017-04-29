package com.example.intel.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton search = (ImageButton) findViewById(R.id.search_button);


        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent searchIntent = new Intent(MainActivity.this, Music.class);


                startActivity(searchIntent);
            }
        });

        ImageButton settings = (ImageButton) findViewById(R.id.settings_button);


        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent settingsIntent = new Intent(MainActivity.this, Settings.class);


                startActivity(settingsIntent);
            }
        });

        ImageButton songInfo = (ImageButton) findViewById(R.id.song_info_button);


        songInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent settingsIntent = new Intent(MainActivity.this, SongInfo.class);


                startActivity(settingsIntent);
            }
        });

        ImageButton mediaPlayer = (ImageButton) findViewById(R.id.media_player_button);


        mediaPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mediaPlayerIntent = new Intent(MainActivity.this, MediaPlayerActivity.class);


                startActivity(mediaPlayerIntent);
            }
        });


    }

}
