package Views.Center.Middle;

import Views.MyPanel;

import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PlayList extends MyPanel {
    public PlayList() {
        init();
    }

    @Override
    protected void init() {
        setOpaque(false);
        setLayout(new GridLayout(7, 1));
        setBorder(new EmptyBorder(0,30,0,30));
        add(new Music());
        add(new Music());
        add(new Music());
        add(new Music());
        add(new Music());
        add(new Music());
        add(new Music());
    }
}
