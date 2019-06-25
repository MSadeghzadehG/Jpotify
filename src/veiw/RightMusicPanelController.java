package veiw;

import javax.swing.*;
import java.awt.*;

public class RightMusicPanelController extends JPanel {
    GridBagConstraints gbc;
    public RightMusicPanelController(){
        this.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.fill = GridBagConstraints.BOTH;
        JLabel songName = new JLabel();
    }

}
