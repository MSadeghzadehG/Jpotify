package veiw;

import javax.swing.*;
import java.awt.*;

public class MusicControllerPanel extends JPanel {
    JProgressBar progressBar;
    JSlider slider;
    JButton addToFavoriteButton;
    public MusicControllerPanel()
    {
        //this.setPreferredSize(new Dimension(10*250 ,  200));
        setLayout(new BorderLayout());
        progressBar = new JProgressBar(0 , 100);
        progressBar.setStringPainted(true);
        slider = new JSlider(0 , 100 , 0);
        slider.setPreferredSize(new Dimension( 150, 30));

        add(slider , BorderLayout.NORTH);
        //this.setBackground(Color.black);
        this.setVisible(true);
    }
}
