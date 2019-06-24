package logic;

import java.io.*;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;
import veiw.MusicControllerCenterPanel;


public class MusicPlayer {
    private static final MusicPlayer musicPlayer = new MusicPlayer();
    private PlayerThread player;
    private Song song;
    private MusicLinker musicLinker;

    private MusicPlayer() {
    }


    public void setMusicLinker(MusicLinker musicLinker) {
        player.setMusicLinker(musicLinker);
    }

    public static MusicPlayer getInstance() {
        return musicPlayer;
    }

    public void addSongToPlay(Song song){
        this.song = song;
        try {
            player = new PlayerThread(song);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }

    public Song getSong(){
        return this.song;
    }

    public void play(){
        if (player.getStatus())
            player.mp3Resume();
        else {
            player.start();
        }

    }

    public void seekTo(double percentage) {
        try {
            player.seekTo(percentage);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }

    // mikhayam ino??
//    public void stop() {
//        player.mp3Stop();
//    }

    public void pause() {
        player.mp3Pause();
    }

//    public static void play() throws InterruptedException, IOException, JavaLayerException ,InvalidDataException, UnsupportedTagException {
//
//        logic.PlayerThread t1 = (new logic.PlayerThread("/Users/msg_pc/Desktop/Jpotify/src/musics/b.mp3")); // MP3 Address
//        t1.start(); // Play for 1 seconds
//
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
//            t1 = (new logic.PlayerThread("/Users/msg_pc/Desktop/Jpotify/src/musics/a.mp3")); // Restart Playing
//        } catch (InvalidDataException e) {
//            e.printStackTrace();
//        } catch (UnsupportedTagException e) {
//            e.printStackTrace();
//        }
//        t1.start();
//        Thread.sleep(3000);
//        t1.mp3Stop(); // Full stop
//    }
}

class PlayerThread extends Thread {
    private boolean pause;
    private boolean stop;
    private boolean isStarted;
    private Song song;
    private int currentFrame;
    private MusicLinker musicLinker;

    private AdvancedPlayer player;

    public PlayerThread(Song song) throws IOException, JavaLayerException {
        pause = false;
        stop = false;
        isStarted = false;
        this.song = song;
        currentFrame = 0;
        player = new AdvancedPlayer(new FileInputStream(new File(song.getSrc())));
        this.musicLinker = musicLinker;
    }
    public void setMusicLinker(MusicLinker musicLinker)
    {
        this.musicLinker = musicLinker;

    }

    public void mp3Pause() {
        this.pause = true;
    }

    public void mp3Resume() {
        this.pause = false;
        synchronized (player) {
            player.notifyAll();
        }
//        System.out.println("resume oomad");

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
            player = new AdvancedPlayer(new FileInputStream(new File(song.getSrc())));
            int frame = (int)(Math.floor(percentage*song.getArtwork().getFrameCount()/100.0));
            currentFrame = frame;
            if (!pause)
                player.play(frame, frame + 1);
//            System.out.println("seek to oomad");
        }
    }

    public boolean getStatus() {
        return this.isStarted;
    }

    public int getCurrentFrame() {
        return currentFrame;
    }

    @Override
    public void run() {
        this.isStarted = true;
        double percentage = 0.0;
        try {
            while (!stop && player.play(1)) {
                if (pause) {
                    synchronized (player) {
                        player.wait();
                    }
                }
                currentFrame++;
                percentage = (double)currentFrame/this.song.getArtwork().getFrameCount();
                if (currentFrame%10==0)
                    musicLinker.musicStatus(percentage);
            }
            // call listplay next function
            System.out.println("FINISHED.");
            // Play finished.
        } catch (JavaLayerException | InterruptedException e) {
            e.printStackTrace();
        }
    }


}