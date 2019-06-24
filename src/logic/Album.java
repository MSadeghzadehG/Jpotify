package logic;

public class Album extends Playlist {
    private Artist artist;

    public Album(String name, Artist artist) {
        super(name);
        this.artist = artist;
    }

    @Override
    public void addSong(Song song) {
        if (artist.equals(song.getArtist()))
           super.addSong(song);

        else {
            System.out.println("wrong artist added");
        }
    }
}
