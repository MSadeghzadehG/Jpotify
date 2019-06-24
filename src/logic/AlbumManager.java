package logic;

import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;

import java.io.IOException;
import java.util.HashMap;

public class AlbumManager {

    private static final AlbumManager albumManager = new AlbumManager();
    private HashMap<String, Album> albums;
    private HashMap<String, Artist> artists;
    private HashMap<String, Song> songs;


    private AlbumManager() {
        albums = new HashMap<>();
        artists = new HashMap<>();
        songs = new HashMap<>();
    }

    public static AlbumManager getInstance() {
        return albumManager;
    }

    public Album getSongAlbum(String albumName, Artist artistName){
        if (albums.containsKey(albumName)) {
            return albums.get(albumName);
        } else {
            return new Album(albumName,artistName);
        }
    }

    public Artist getSongArtist(String artistName) {
        if (artists.containsKey(artistName)) {
            return artists.get(artistName);
        } else {
            return new Artist(artistName);
        }
    }

    public Song addNewSong(String song_src){
        try {
            Mp3File song_artwork = new Mp3File(song_src);
            long length = song_artwork.getLengthInSeconds();
            byte[] cover = song_artwork.getId3v2Tag().getAlbumImage();
            String songName = song_artwork.getId3v2Tag().getTitle();
            Artist artist = getSongArtist(song_artwork.getId3v2Tag().getAlbumArtist());
            Album album = getSongAlbum(song_artwork.getId3v2Tag().getAlbum(), artist);
            Song song = new Song(songName,cover,length,artist,album, song_src, song_artwork);
            songs.put(songName, song);
            return song;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnsupportedTagException e) {
            e.printStackTrace();
        } catch (InvalidDataException e) {
            e.printStackTrace();
        }
        return null;
    }

    public HashMap<String, Album> getAlbums() {
        return albums;
    }

    public HashMap<String, Artist> getArtists() {
        return artists;
    }

    public HashMap<String, Song> getSongs() {
        return songs;
    }
}
