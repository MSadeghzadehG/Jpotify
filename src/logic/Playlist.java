package logic;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<Song> songs;
    private  String name;

    public Playlist(String name) {
        this.name = name;
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }
}
