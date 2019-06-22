package Views.Center.Left;

import Views.MyPanel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PlayListContainer extends MyPanel {

    public PlayListContainer() {
        init();
    }

    @Override
    protected void init() {
        GridLayout gridLayout = new GridLayout(5, 1);
        add(new PlayListButtons("Library"));
        add(new PlayListButtons("Queue"));
        add(new PlayListButtons("Leaden Sky"));
        add(new PlayListButtons("Paranoid Life"));
        setLayout(gridLayout);
        setOpaque(false);
        setBorder(new EmptyBorder(0,0,0,0));
    }

}
