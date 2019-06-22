package Views.Center.Left;

import Views.Listeners;
import Views.MyPanel;

import java.awt.*;
import java.awt.event.MouseMotionListener;

public class LeftPanel extends MyPanel {
    private Point cord;

    public LeftPanel() {
        init();
    }

    @Override
    protected void init() {
        setBackground(new Color(0x121212));
        setMinimumSize(new Dimension(150, 300));
        setLayout(new BorderLayout());
        add(new PlayListContainer(), BorderLayout.PAGE_START);
        add(new AddNewPlayList(), BorderLayout.PAGE_END);
        addMouseMotionListener((MouseMotionListener) Listeners.getFrameMove());
    }


}
