import java.io.*;

import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;


public class MusicPlayer {

    public static void play() throws InterruptedException, IOException, JavaLayerException ,InvalidDataException, UnsupportedTagException {

        PlayerThread t1 = (new PlayerThread("/Users/msg_pc/Desktop/Jpotify/src/musics/b.mp3")); // MP3 Address
        t1.start(); // Play for 1 seconds
//        System.out.println("Play for 5 seconds");
//        Thread.sleep(5000);
//        System.out.println("seeked to 80");
//        t1.seekTo(80.0); // Seeks to 95% of music and plays for 3 seconds
//        t1.mp3Pause(); // Pause for 3 seconds
//        System.out.println("Pause for 3 seconds");
//        Thread.sleep(3000);
//        t1.mp3Resume(); // Resume for 3 seconds
//        Thread.sleep(30);
//        Thread.sleep(1000);
//        t1.mp3Stop(); // Full stop
//        System.out.println("after one second stoped");
//        Thread.sleep(3000);

//        try {
//            t1 = (new PlayerThread("/Users/msg_pc/Desktop/Jpotify/src/musics/a.mp3")); // Restart Playing
//        } catch (InvalidDataException e) {
//            e.printStackTrace();
//        } catch (UnsupportedTagException e) {
//            e.printStackTrace();
//        }
//        t1.start();
//        Thread.sleep(3000);
//        t1.mp3Stop(); // Full stop

    }

}
class PlayerThread extends Thread
{
    private Mp3File mp3File;
    private boolean pause;
    private boolean stop;
    private String file;
    private AdvancedPlayer player;

    public PlayerThread(String file) throws InvalidDataException, IOException, UnsupportedTagException, JavaLayerException {
        pause = false;
        stop = false;
        this.file = file;
        this.mp3File = new Mp3File(file);
        FileInputStream bufferedInputStream = (new FileInputStream(new File(file)));
        player = new AdvancedPlayer(bufferedInputStream);
    }

    public void getStatus(){
        System.out.println(mp3File.getId3v2Tag().getTitle());
        System.out.println(mp3File.getId3v2Tag().getAlbumArtist());
        System.out.println(mp3File.getId3v2Tag().getAlbum());
    }

    public void mp3Pause() {
        this.pause = true;
    }

    public void mp3Resume() {
        this.pause = false;
        synchronized (player) {
            player.notifyAll();
        }
    }

    public void mp3Stop() {
        this.stop = true;
        synchronized (player) {
            player.close();
        }
    }

    public void seekTo(double percentage) throws FileNotFoundException, JavaLayerException {
        synchronized (player) {
            player.close();
            FileInputStream bufferedInputStream = (new FileInputStream(new File(file)));
            player = new AdvancedPlayer(bufferedInputStream);
            int frame = (int)(Math.floor(percentage*mp3File.getFrameCount()/100.0));
            player.play(frame, frame + 1);
        }
    }

    @Override
    public void run() {
        this.getStatus();
        try {
            while (!stop && player.play(1)) {
                if (pause) {
                    synchronized (player) {
                        player.wait();
                    }
                }
            }

            // call listplay next function
            System.out.println("FINISHED.");
            // Play finished.

        } catch (JavaLayerException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}