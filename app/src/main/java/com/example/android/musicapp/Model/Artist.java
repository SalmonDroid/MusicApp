package com.example.android.musicapp.Model;

public class Artist {

    private String mArtist;
    private String mSong;
    private String mAlbum;

    public Artist(String artist, String song, String album) {
        mArtist = artist;
        mSong = song;
        mAlbum = album;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getSong() {
        return mSong;
    }

    public String getAlbum() {
        return mAlbum;
    }
}
