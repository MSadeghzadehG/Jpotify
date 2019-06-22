package Views.Footer;

import Views.MyPanel;

import javax.swing.border.EmptyBorder;
import java.awt.*;

public class FooterPanel extends MyPanel {

    public FooterPanel() {
        init();
    }

    @Override
    protected void init() {
        setBackground(new Color(0x282828));
        setBorder(new EmptyBorder(30, 0, 30, 0));
    }


}
