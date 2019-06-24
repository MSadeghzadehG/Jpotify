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

        add(slider , BorderLayout.NORTH);
        //this.setBackground(Color.black);
        this.setVisible(true);
    }
    private void setGbc()
    {
         gbc.gridx = 8;
        gbc.gridy = 0;
        gbc.weighty = 6;
        gbc.weightx = 1.5;
        gbc.gridheight = 6;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.fill = GridBagConstraints.BOTH;
    }
}
