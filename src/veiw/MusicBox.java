package veiw;

import logic.MusicPlayer;
import logic.Song;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MusicBox extends JPanel implements MouseListener {
    private Song song;
    private JLabel musicDescription;
    public MusicBox(Song song)
    {
        setPreferredSize(new Dimension(400 , 400));
        setLayout(new BorderLayout());
        add(new JLabel(song.getCover()) , BorderLayout.CENTER);
        String musicDescriptionInfo = "Title:" + song.getName();
        this.song = song;
        musicDescription = new JLabel(musicDescriptionInfo);
        musicDescription.setFont(new Font("Serif", Font.PLAIN, 20));
        add(musicDescription , BorderLayout.SOUTH);
        System.out.println(song.getSrc());
        addMouseListener(this);
       // setMinimumSize(new Dimension(300 ,300));
        setVisible(true);
       // this.setLayout(new BorderLayout());
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println(song.getSrc());
        MusicPlayer.getInstance().addSongToPlay(song);
        System.out.println("music is choosed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
