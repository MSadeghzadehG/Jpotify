import java.util.ArrayList;

public class Artist {
    private String name;
    private ArrayList<Song> songs;
    private ArrayList<Album> albums;

    public Artist(String name) {
        this.name = name;
        songs = new ArrayList<>();
        albums = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }
}
