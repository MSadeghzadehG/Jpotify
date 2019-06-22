package Views.Center.Left;

import Views.MyPanel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class AddNewPlayList extends MyPanel {
    private JButton addPlayList;
    private JLabel icon;

    public AddNewPlayList() {
        addPlayList = new JButton("New Playlist");
        icon = new JLabel();
        init();
    }

    @Override
    protected void init() {
        setBorder(new MatteBorder(1, 0, 0, 0, new Color(0x202020)));
        setLayout(new FlowLayout(0, 0, 0));
        icon.setIcon(new ImageIcon(("./src/Icons/add.png")));
        setOpaque(false);
        icon.setBorder(new EmptyBorder(20, 10, 20, 0));
        addPlayList.setOpaque(false);
        addPlayList.setBorder(new EmptyBorder(20, 10, 20, 19));
        addPlayList.setFont(new Font("sans-serif", Font.PLAIN, 14));
        addPlayList.setForeground(new Color(0xACACAC));
        addPlayList.setContentAreaFilled(false);
        addPlayList.setFocusPainted(false);
        add(icon);
        add(addPlayList);
    }
}
