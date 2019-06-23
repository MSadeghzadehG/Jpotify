public class Main {
    public static void main(String[] arg) {
        Song testSong = AlbumManager.getInstance().addNewSong("/Users/msg_pc/Desktop/Jpotify/src/musics/b.mp3");
        MusicPlayer.getInstance().addSongToPlay(testSong);
        MusicPlayer.getInstance().play();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MusicPlayer.getInstance().pause();

    }
}
