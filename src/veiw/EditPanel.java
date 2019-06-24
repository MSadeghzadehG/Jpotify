package veiw;

import javax.swing.*;
import java.awt.*;

public class EditPanel extends JPanel {

    JButton addSongButton;
    JButton songButton;
    JButton artistButton;
    JButton albumsButton;


    public EditPanel()
    {
   //     this.setBackground(Color.BLACK);
        setLayout(new GridLayout(4 , 1));
        songButton = new JButton("add song");
        artistButton = new JButton("artists");
        addSongButton = new JButton("add song");
        albumsButton = new JButton("album");
        add(addSongButton);
        add(songButton);
        add(albumsButton);
        add(artistButton);


        setVisible(true);

    }
}
