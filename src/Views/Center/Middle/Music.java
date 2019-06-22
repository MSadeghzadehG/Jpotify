package Views.Center.Middle;

import Views.MyPanel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class Music extends MyPanel {

    private JButton play;
    private JButton add;
    private JButton more;
    private JLabel name;
    private JLabel artist;
    private JLabel album;
    private JLabel time;
    private JLabel length;

    public Music() {
        play = new JButton("");
        add = new JButton("");
        more = new JButton("m");
        name = new JLabel("The great gig in the sky");
        artist = new JLabel("Pink Floyd");
        album = new JLabel("The Wall");
        time = new JLabel("a day ago");
        length = new JLabel("8:04");
        init();
    }

    @Override
    protected void init() {
        setBorder(new MatteBorder(1, 0, 1, 0, new Color(0x202020)));
        setLayout(new GridLayout(1,8));
        setOpaque(false);
        configureBut(play);
        play.setIcon(new ImageIcon("./src/Icons/play.png"));
        configureBut(add);
        add.setIcon(new ImageIcon("./src/Icons/plus.png"));
        configureBut(more);
        add.setBorder(new EmptyBorder(0, 0, 0, 15));
        name.setFont(new Font("sans-serif", Font.PLAIN, 15));
        name.setMinimumSize(new Dimension(500,50));
        name.setForeground(Color.white);
//        name.setBorder(new EmptyBorder(0, 0, 0, 100));

        artist.setFont(new Font("sans-serif", Font.PLAIN, 15));
        artist.setForeground(Color.white);
        artist.setBorder(new EmptyBorder(0, 0, 0, 15));
        album.setFont(new Font("sans-serif", Font.PLAIN, 15));
        album.setForeground(Color.white);
        time.setFont(new Font("sans-serif", Font.PLAIN, 15));
        time.setForeground(Color.white);
        length.setFont(new Font("sans-serif", Font.PLAIN, 15));
        length.setForeground(Color.white);
        add(play);
        add(add);
        add(name);
        add(artist);
        add(album);
        add(more);
        add(time);
        add(length);
    }

    private void configureBut(JButton jButton) {
        jButton.setContentAreaFilled(false);
        jButton.setFocusPainted(false);
        jButton.setBorder(new EmptyBorder(0, 2, 0, 2));
        jButton.setOpaque(false);
        jButton.setForeground(new Color(0xACACAC));
        jButton.setFont(new Font("sans-serif", Font.PLAIN, 15));

    }

}
