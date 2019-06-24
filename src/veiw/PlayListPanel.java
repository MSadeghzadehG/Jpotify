package veiw;

import javax.swing.*;
import java.awt.*;

public class PlayListPanel extends JPanel {

    JButton createNewPlaylist;
    JList <String>playLists;
    JScrollPane scrollPane;
    public PlayListPanel()
    {

        DefaultListModel<String> model = new DefaultListModel<>();
   //     JList<String> listIn = new JList<>( model );
        playLists = new JList<>(model);
        playLists.setFixedCellHeight(50);
        //this.setPreferredSize(new Dimension(2*250 , 2*250));
        setLayout(new BorderLayout());
        this.setBackground(Color.YELLOW);
        createNewPlaylist = new JButton("new PlayList");
        String[] strings = new String[30];
        add(createNewPlaylist, BorderLayout.NORTH);

        for(int i=0;i<30;i++)
        {
            strings[i] = "salam" + i;
            model.addElement(strings[i]);
        }

        scrollPane = new JScrollPane(playLists);
        add(scrollPane , BorderLayout.CENTER);
        this.setVisible(true);
    }
}
