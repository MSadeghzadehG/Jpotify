package Views.Center.Right;

import Views.Listeners;
import Views.MyPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseMotionListener;

public class RightPanel extends MyPanel {

    private WindowController windowController;


    public RightPanel() {
        windowController = new WindowController();
        init();
    }

    @Override
    protected void init() {
        setBackground(new Color(0x121112));
        setMinimumSize(new Dimension(200, 300));
        setLayout(new BorderLayout(0,0));
        JPanel sparatorPanel = new JPanel();
        JPanel emptyPanel = new JPanel();
        emptyPanel.setOpaque(false);
        sparatorPanel.setOpaque(false);
        sparatorPanel.setLayout(new FlowLayout(FlowLayout.TRAILING, 0, 0));
        sparatorPanel.add(emptyPanel);
        sparatorPanel.add(windowController);
        add(sparatorPanel,BorderLayout.PAGE_START);
        add(new FriendsContainer());
        setMaximumSize(new Dimension(200, 800));
        addMouseMotionListener((MouseMotionListener) Listeners.getFrameMove());
    }
}
