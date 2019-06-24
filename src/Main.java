import logic.AlbumManager;
import logic.MusicPlayer;
import logic.Song;
import veiw.MainFrame;

public class Main {
    public static void main(String[] arg) {
        Song testSong = AlbumManager.getInstance().addNewSong("src/musics/b.mp3");

        MusicPlayer.getInstance().addSongToPlay(testSong);
        MainFrame mainFrame = new MainFrame();
        MusicPlayer.getInstance().setMusicLinker(mainFrame.getMusicControllerPanel().getCenterPanel());
        AlbumManager.getInstance().setMusicAddListener(mainFrame.getCenterPanel());
//        MusicPlayer.getInstance().play();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        MusicPlayer.getInstance().seekTo(50);

    }
}
