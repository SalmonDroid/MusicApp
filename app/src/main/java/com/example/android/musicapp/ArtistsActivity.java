package com.example.android.musicapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.android.musicapp.Model.Artist;

import java.util.ArrayList;

import static android.R.*;
import static android.R.layout.*;


public class ArtistsActivity extends AppCompatActivity {

    public static final String ARTIST_NAME = "artist_name";
    public static final String SONG_NAME = "song_name";
    public static final String ALBUM_NAME = "album_name";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_activity);

        final ArrayList<Artist> artists = new ArrayList<Artist>();
        artists.add(new Artist("Coheed and Cambria", "Keeping the Blade", "Good Apollo, I'm Burning Star IV"));
        artists.add(new Artist("Coheed and Cambria", "Always & Never", "Good Apollo, I'm Burning Star IV"));
        artists.add(new Artist("Coheed and Cambria", "Welcome Home", "Good Apollo, I'm Burning Star IV"));
        artists.add(new Artist("Coheed and Cambria", "Ten Speed", "Good Apollo, I'm Burning Star IV"));
        artists.add(new Artist("Coheed and Cambria", "Crossing the Frame", "Good Apollo, I'm Burning Star IV"));
        artists.add(new Artist("Coheed and Cambria", "Apollo 1: The Writing Writer", "Good Apollo, I'm Burning Star IV"));
        artists.add(new Artist("Coheed and Cambria", "Once Upon Your Dead Body", "Good Apollo, I'm Burning Star IV"));
        artists.add(new Artist("Coheed and Cambria", "Wake Up", "Good Apollo, I'm Burning Star IV"));
        artists.add(new Artist("Coheed and Cambria", "The Suffering", "Good Apollo, I'm Burning Star IV"));
        artists.add(new Artist("Coheed and Cambria", "The Lying Lies & Dirty Secrets of Miss Erica Court", "Good Apollo, I'm Burning Star IV"));
        artists.add(new Artist("Coheed and Cambria", "Mother May I", "Good Apollo, I'm Burning Star IV"));

        ArtistAdapter adapter = new ArtistAdapter(this, artists);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Artist currentArtist = artists.get(i);
                Intent listViewIntent = new Intent(ArtistsActivity.this, PlayingActivity.class);
                listViewIntent.putExtra(ARTIST_NAME, currentArtist.getArtist());
                listViewIntent.putExtra(SONG_NAME, currentArtist.getSong());
                listViewIntent.putExtra(ALBUM_NAME, currentArtist.getAlbum());
                startActivity(listViewIntent);
                finish();
            }
        });

    }
}