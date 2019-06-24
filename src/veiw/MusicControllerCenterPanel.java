package veiw;

import logic.MusicPlayer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MusicControllerCenterPanel extends JPanel {
    GridBagConstraints gbc;

    public MusicControllerCenterPanel() {
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.fill = GridBagConstraints.BOTH;

        JButton play = new JButton("play");
        JButton pause = new JButton("pause");

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


        this.setVisible(true);
    }
}