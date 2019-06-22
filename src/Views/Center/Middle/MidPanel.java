package Views.Center.Middle;

import Views.Listeners;
import Views.MyPanel;

import java.awt.*;
import java.awt.event.MouseMotionListener;

public class MidPanel extends MyPanel {

    public MidPanel() {
        init();
    }

    @Override
    protected void init() {
        setBackground(new Color(24, 24, 24));
        setMinimumSize(new Dimension(700, 700));
        addMouseMotionListener((MouseMotionListener) Listeners.getFrameMove());
        addMouseListener(Listeners.getFrameMove());
        setLayout(new BorderLayout());
        add(new PlayList(), BorderLayout.PAGE_START);
    }
}

