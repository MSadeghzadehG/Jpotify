package veiw;

import logic.MusicPlayer;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MusicControllerCenterPanel extends JPanel implements logic.MusicLinker{
    private GridBagConstraints gbc;
    private JProgressBar progressBar;
    private JSlider slider;
    private String endTime;
    private String currentTime;

//    private static final MusicControllerCenterPanel instance = new MusicControllerCenterPanel();

    public MusicControllerCenterPanel() {
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.fill = GridBagConstraints.BOTH;

        progressBar = new JProgressBar(0 , 100);
        progressBar.setStringPainted(true);
        slider = new JSlider(0 , 1000 , 0);

        endTime = MusicPlayer.getInstance().getSong().getLength();

        JButton play = new JButton("play");
        JButton pause = new JButton("pause");
        JButton previous = new JButton("previous");
        JButton next = new JButton("next");
        JButton shuffle = new JButton("shuffle");
        JButton repeat = new JButton("repeat");

        gbc.gridheight = 1;
        gbc.gridwidth = 1;

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx=1;
        gbc.weighty=1;
        this.add(play, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx=1;
        gbc.weighty=1;
        this.add(pause, gbc);
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.weightx=1;
        gbc.weighty=1;
        this.add(previous, gbc);
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.weightx=1;
        gbc.weighty=1;
        this.add(next, gbc);
        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.weightx=1;
        gbc.weighty=1;
        this.add(shuffle, gbc);
        gbc.gridx = 5;
        gbc.gridy = 0;
        gbc.weightx=1;
        gbc.weighty=1;
        this.add(repeat, gbc);

        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MusicPlayer.getInstance().play();
            }
        });

        pause.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MusicPlayer.getInstance().pause();
            }
        });
        gbc.gridwidth = 6;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx=6;
        gbc.weighty=1;
        this.add(progressBar, gbc);

        progressBar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                System.out.println("function is called");
//                MusicPlayer.getInstance().pause();
                MusicPlayer.getInstance().seekTo((double)slider.getValue()/1000);
//                System.out.println((double)slider.getValue()/MusicPlayer.getInstance().getSong().getArtwork().getLengthInSeconds());
                System.out.println(progressBar.getValue());
//                MusicPlayer.getInstance().play();
            }

        });

        this.setVisible(true);
    }


    @Override
    public void musicStatus(double percentage) {
        progressBar.setValue((int)(percentage*1000));
        this.repaint();
    }
}