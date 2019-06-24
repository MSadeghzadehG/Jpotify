package veiw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditPanel extends JPanel {

    JButton addSongButton;
    JButton songButton;
    JButton artistButton;
    JButton albumsButton;


    public EditPanel()
    {
   //     this.setBackground(Color.BLACK);
        setLayout(new GridLayout(4 , 1));
        songButton = new JButton("songs");
        artistButton = new JButton("artists");
        addSongButton = new JButton("add song");
        albumsButton = new JButton("album");
        add(addSongButton);
        add(songButton);
        add(albumsButton);
        add(artistButton);
        setAddSongButtonActionListener();
        setVisible(true);

    }
    public void setAddSongButtonActionListener()
    {
        addSongButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MusicChooser musicChooser = new MusicChooser();
            }
        });
    }
}
