import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Song {
    private String song_src;
    private String cover_src;
    private long length;
    private Artist artist;
    private Album album;

    public Song(String song_src) {
        this.song_src = song_src;
        Mp3File mp3File =  null;
        try {
            mp3File =  new Mp3File(song_src);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnsupportedTagException e) {
            e.printStackTrace();
        } catch (InvalidDataException e) {
            e.printStackTrace();
        }

        this.length = mp3File.getLengthInSeconds();
        String albumName = mp3File.getId3v2Tag().getAlbum();
        this.artist = new Artist(mp3File.getId3v2Tag().getAlbumArtist());
        byte[] albumImageData = mp3File.getId3v2Tag().getAlbumImage();

    }

    public ImageIcon getCover() {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(this.cover_src));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ImageIcon(image);
    }

    public String getLength() {
        return this.length/60 + ":" + this.length%60;
    }
}
