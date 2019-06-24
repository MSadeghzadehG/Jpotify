package veiw;

import javax.swing.*;
import java.awt.*;

public class MusicControllerCenterPanel extends JPanel {
    GridBagConstraints gbc;

    public MusicControllerCenterPanel() {
        setLayout(new GridBagLayout());
        JButton play = new JButton("play");
        JButton pause = new JButton("pause");

    }
}