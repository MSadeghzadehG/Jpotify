package veiw;

import javax.swing.*;
import java.awt.*;

public class LeftPanel extends JPanel {

    private EditPanel editPanel;
    private PlayListPanel playListPanel;
    private MusicInfoPanel musicInfoPanel;
    private GridBagConstraints gbc;

    public LeftPanel()
    {
       // setPreferredSize(new Dimension(2*250 , 6 * 200));
        GridBagLayout gridBagLayout = new GridBagLayout();
        gbc = new GridBagConstraints();
        setLayout(gridBagLayout);
        addAllPanels();
        setVisible(true);
    }
    private void addAllPanels()
    {



        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridheight = 1;
        gbc.weighty = 0.45;
        gbc.weightx = 1;

        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 0;
        editPanel = new EditPanel();
        add(editPanel , gbc);
        gbc.weighty = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        playListPanel = new PlayListPanel();
        add(playListPanel ,gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weighty = 0.75;
        musicInfoPanel = new MusicInfoPanel();
        add(musicInfoPanel , gbc);
    }
}
