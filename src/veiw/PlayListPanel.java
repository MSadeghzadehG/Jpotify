package veiw;

import javax.swing.*;
import java.awt.*;

public class PlayListPanel extends JPanel {

    JButton createNewPlaylist;
    public PlayListPanel()
    {

        //this.setPreferredSize(new Dimension(2*250 , 2*250));
        setLayout(new BorderLayout());
        this.setBackground(Color.YELLOW);
        createNewPlaylist = new JButton("new PlayList");
        add(createNewPlaylist, BorderLayout.NORTH);

        this.setVisible(true);
    }
}
