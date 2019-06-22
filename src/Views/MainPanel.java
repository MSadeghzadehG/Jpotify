package Views;

import Views.Center.CenterPanel;
import Views.Footer.FooterPanel;

import javax.swing.border.EmptyBorder;
import java.awt.*;


public class MainPanel extends MyPanel {

    public MainPanel() {
        init();
    }



    @Override
    protected void init() {
        BorderLayout borderLayout = new BorderLayout(0, 0);
        setLayout(borderLayout);
        add(new CenterPanel(), BorderLayout.CENTER);
        add(new FooterPanel(), BorderLayout.PAGE_END);
        setBorder(new EmptyBorder(2, 1, 0, 1));
        EmptyBorder emptyBorder;
        setBackground(new Color(24, 24, 24));
    }

}
