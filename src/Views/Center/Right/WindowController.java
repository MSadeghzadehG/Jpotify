package Views.Center.Right;

import Views.MyPanel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class WindowController extends MyPanel {

    private JButton close;
    private JButton maximize;
    private JButton minimize;

    public WindowController() {
        init();
    }

    @Override
    protected void init() {
//        setBackground(new Color(0x181818));
        close = new JButton();
        close.setSize(new Dimension(40,40));
        maximize = new JButton();
        minimize = new JButton();
        minimize.setBackground(new Color(0x181818));
        maximize.setBackground(new Color(0x181818));
        close.setBackground(new Color(0x181818));
        close.setIcon(new ImageIcon("./src/Icons/close.png"));
        maximize.setIcon(new ImageIcon("./src/Icons/maximize.png"));
        minimize.setIcon(new ImageIcon("./src/Icons/minimize.png"));
        close.setBorder(new EmptyBorder(8,20,8,19));
        minimize.setBorder(new EmptyBorder(4,8,4,8));
        maximize.setBorder(new EmptyBorder(4,8,4,8));
        this.setLayout(new GridLayout(1,3));
        this.add(minimize);
        this.add(maximize);
        this.add(close);
    }
}
