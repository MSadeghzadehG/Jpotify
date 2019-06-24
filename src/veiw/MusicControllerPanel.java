package veiw;

import javax.swing.*;
import java.awt.*;

public class MusicControllerPanel extends JPanel {
    JProgressBar progressBar;
    JSlider slider;
    JButton addToFavoriteButton;
    GridBagConstraints gbc;
    public MusicControllerPanel()
    {
        //this.setPreferredSize(new Dimension(10*250 ,  200));
        setLayout(new GridBagLayout());
        progressBar = new JProgressBar(0 , 100);
        progressBar.setStringPainted(true);
        slider = new JSlider(0 , 100 , 0);
        slider.setPreferredSize(new Dimension( 150, 30));
        gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.fill = GridBagConstraints.BOTH;


        MusicControllerCenterPanel center = new MusicControllerCenterPanel();
        center.setBackground(Color.red);
        JPanel right = new JPanel(new BorderLayout());
        right.setBackground(Color.blue);
        JPanel left = new JPanel(new BorderLayout());
        left.setBackground(Color.BLUE);


        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.weightx=4;
        gbc.weighty=1;
        this.add(center, gbc);
        gbc.gridx = 6;
        gbc.gridy = 0;
        gbc.weightx=2;
        gbc.weighty=1;
        this.add(right, gbc);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx=2;
        gbc.weighty=1;
        this.add(left, gbc);
        //this.setBackground(Color.black);
        this.setVisible(true);
//        center.add(slider, BorderLayout.SOUTH);



    }
    private void setGbc()
    {
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 6;
        gbc.weightx = 1.5;
        gbc.gridheight = 6;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.fill = GridBagConstraints.BOTH;
    }
}
