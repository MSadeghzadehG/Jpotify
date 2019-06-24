package veiw;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private EditPanel editPanel;
    private SearchPanel searchPanel;
    private FriendActivityPanel friendActivityPanel;
    private MusicControllerPanel musicControllerPanel;
    private CenterPanel centerPanel;
    private PlayListPanel playListPanel;
    private LeftPanel leftPanel;

    GridBagLayout gridBagLayout;
    GridBagConstraints gbc;

    public MainFrame()
    {
        super("Spotify");
        setSize(2500 , 1300);
        setLocation(400 , 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gridBagLayout = new GridBagLayout();
         gbc = new GridBagConstraints();

        setLayout(gridBagLayout);
        addLeftPanel();
        addSearchPanel();
        addFriendActivityPanel();
        addMusicControlerPanel();
        addCenterPanel();
        setVisible(true);

    }
    public void addEditPanel()
    {
      //  gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;//GridBagConstraints.RELATIVE;


        gbc.gridy = 0;//GridBagConstraints.RELATIVE;

        gbc.weighty = 2.5;
        gbc.weightx = 2;
        editPanel = new EditPanel();
        add(editPanel , gbc);
    }
    public void addSearchPanel()
    {
        //gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 0;


        gbc.weighty = 0.25;
        gbc.weightx = 6;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
//        gbc.anchor = GridBagConstraints.CENTER;

        gbc.gridwidth = 2;
        gbc.gridheight = 1;

        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.fill = GridBagConstraints.BOTH;
        searchPanel = new SearchPanel();
        add(searchPanel , gbc);
    }
    public void addFriendActivityPanel()
    {
        gbc.gridx = 8;
        gbc.gridy = 0;
        gbc.weighty = 6;
        gbc.weightx = 1.5;
        gbc.gridheight = 6;
        gbc.gridwidth = 1;


        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.fill = GridBagConstraints.BOTH;
        friendActivityPanel = new FriendActivityPanel();
        add(friendActivityPanel , gbc);
    }
    public void addMusicControlerPanel()
    {
        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.weighty = 1;
        gbc.weightx = 10;
        gbc.gridwidth = 10;
        gbc.gridheight = 1;

        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.fill = GridBagConstraints.BOTH;
        musicControllerPanel = new MusicControllerPanel();
        add(musicControllerPanel , gbc);
    }
    public void addCenterPanel()
    {
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.weighty = 5;
        gbc.weightx = 6;
        gbc.gridwidth = 6;
        gbc.gridheight = 5;

        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.fill = GridBagConstraints.BOTH;

        centerPanel = new CenterPanel();
        JScrollPane middleScrollPane = new JScrollPane(centerPanel);
        add(middleScrollPane , gbc);
       // add(middleScrollPane , gbc);
    }
    public void addLeftPanel()
    {
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 8;
        gbc.weightx = 1.5;
        gbc.gridwidth = 1;
        gbc.gridheight = 8;

        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.fill = GridBagConstraints.BOTH;
        leftPanel = new LeftPanel();
        add(leftPanel , gbc);
    }
}

