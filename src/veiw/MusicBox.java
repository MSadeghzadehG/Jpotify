package veiw;

import logic.Song;

import javax.swing.*;
import java.awt.*;

public class MusicBox extends JPanel {
    private Song song;
    public MusicBox(Song song)
    {
        setPreferredSize(new Dimension(400 , 400));
        setLayout(new BorderLayout());
        add(new JLabel(song.getCover()) , BorderLayout.CENTER);
        System.out.println("new Music Box added");
       // setMinimumSize(new Dimension(300 ,300));
        setVisible(true);
       // this.setLayout(new BorderLayout());
    }

}
