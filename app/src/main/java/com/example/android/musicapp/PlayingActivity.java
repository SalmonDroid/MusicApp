package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import static com.example.android.musicapp.ArtistsActivity.ARTIST_NAME;
import static com.example.android.musicapp.ArtistsActivity.SONG_NAME;
import static com.example.android.musicapp.ArtistsActivity.ALBUM_NAME;
public class PlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playing_activity);

        String playingSong = getIntent().getStringExtra("SONG_NAME");
        String playingArtist = getIntent().getStringExtra("ARTIST_NAME");
        String playingAlbum = getIntent().getStringExtra("ALBUM_NAME");

        Intent intent = getIntent();
        if (null != intent) {
            playingArtist = intent.getStringExtra(ARTIST_NAME);
            playingSong = intent.getStringExtra(SONG_NAME);
            playingAlbum = intent.getStringExtra(ALBUM_NAME);
        }

        TextView playingSongText = (TextView) findViewById(R.id.playing_song);
        playingSongText.setText(playingSong);

        TextView playingArtistText = (TextView) findViewById(R.id.playing_artist);
        playingArtistText.setText(playingArtist);

        TextView playingAlbumText = (TextView) findViewById(R.id.playing_album);
        playingAlbumText.setText(playingAlbum);
    }
}

