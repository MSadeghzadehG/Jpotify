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
    private String endTime;
    private String currentTime;
    private JLabel currentTimeLabel;
    private JLabel endTimeLabel;

//    private static final MusicControllerCenterPanel instance = new MusicControllerCenterPanel();

    private String calCurrentTime(){
        long songLength = MusicPlayer.getInstance().getSong().getArtwork().getLengthInSeconds();
        int currentSecond = (int) Math.floor((double)progressBar.getValue()/1000*songLength);
//        System.out.println(currentSecond);
        return currentSecond/60 + ":" + currentSecond%60;
    }

    public MusicControllerCenterPanel() {
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.fill = GridBagConstraints.BOTH;

        endTime = MusicPlayer.getInstance().getSong().getLength();
        currentTime = "00:00";

        progressBar = new JProgressBar(0 , 1000);
//        progressBar.setStringPainted(true);
        currentTimeLabel = new JLabel(currentTime);
        endTimeLabel = new JLabel(endTime);

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
        gbc.gridwidth = 4;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx=4;
        gbc.weighty=1;
        this.add(progressBar, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx=1;
        gbc.weighty=1;
        this.add(currentTimeLabel, gbc);
        gbc.gridx = 5;
        gbc.gridy = 1;
        gbc.weightx=1;
        gbc.weighty=1;
        this.add(endTimeLabel, gbc);

        progressBar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                System.out.println("function is called");
//                MusicPlayer.getInstance().pause();
//                System.out.println((double)slider.getValue()/MusicPlayer.getInstance().getSong().getArtwork().getLengthInSeconds());
//                System.out.println(progressBar.getValue());
//                MusicPlayer.getInstance().play();
                int mouseX = e.getX();
                int progressBarVal = (int)Math.round(((double)mouseX / (double)progressBar.getWidth()) * progressBar.getMaximum());
                System.out.println(progressBarVal);
                MusicPlayer.getInstance().seekTo((double) progressBarVal/10);
            }

        });

        this.setVisible(true);
    }


    @Override
    public void musicStatus(double percentage) {
        progressBar.setValue((int)(percentage*1000));
        this.currentTime = calCurrentTime();
        currentTimeLabel.setText(currentTime);
//        System.out.println(currentTime);
        this.repaint();
    }
}