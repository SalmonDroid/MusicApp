package com.example.android.musicapp;


import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.musicapp.Model.Artist;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<Artist> {
    public ArtistAdapter(Context context, ArrayList<Artist> artists) {
        super(context, 0, artists);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }

        Artist currentSong = getItem(position);
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.playing_artist);
        artistTextView.setText(currentSong.getArtist());

        TextView songTextView = (TextView) listItemView.findViewById(R.id.playing_song);
        songTextView.setText(currentSong.getSong());

        TextView albumTextView = (TextView) listItemView.findViewById(R.id.playing_album);
        albumTextView.setText(currentSong.getAlbum());

        return listItemView;
    }
}
