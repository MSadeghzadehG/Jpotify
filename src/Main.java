import logic.AlbumManager;
import logic.MusicPlayer;
import logic.Song;
import veiw.MainFrame;

public class Main {
    public static void main(String[] arg) {
        MainFrame mainFrame = new MainFrame();
        Song testSong = AlbumManager.getInstance().addNewSong("src/musics/b.mp3");
        MusicPlayer.getInstance().addSongToPlay(testSong);
//        MusicPlayer.getInstance().play();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        MusicPlayer.getInstance().pause();

    }
}
