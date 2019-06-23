import com.mpatric.mp3agic.Mp3File;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Song {
    private String name;
    private byte[] cover;
    private long length;
    private Artist artist;
    private Album album;
    private String src;
    private Mp3File artwork;

    public Song(String name, byte[] cover, long length, Artist artist, Album album, String src, Mp3File artwork) {
        this.name = name;
        this.cover = cover;
        this.length = length;
        this.artist = artist;
        this.album = album;
        this.src = src;
        this.artwork = artwork;
    }

    public ImageIcon getCover() {
        BufferedImage image = null;
        try {
            File imageFile = null;
            org.apache.commons.io.FileUtils.writeByteArrayToFile(imageFile, cover);
            image = ImageIO.read(imageFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ImageIcon(image);
    }

    public String getLength() {
        return this.length/60 + ":" + this.length%60;
    }

    public Artist getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public String getSrc() {
        return src;
    }

    public Mp3File getArtwork() {
        return artwork;
    }
}
