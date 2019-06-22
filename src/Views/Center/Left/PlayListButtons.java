package Views.Center.Left;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PlayListButtons extends JButton {
    public PlayListButtons(String title) {
        setText(title);
        setBorder(new EmptyBorder(8,20,4,19));
        setOpaque(false);
        setForeground(new Color(0xACACAC));
        setHorizontalAlignment(JButton.LEFT);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setFont(new Font("sans-serif", Font.PLAIN, 15));
    }
}
