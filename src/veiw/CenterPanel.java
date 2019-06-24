package veiw;

import logic.MusicAddListener;
import logic.Song;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CenterPanel extends JPanel implements MusicAddListener {
    GridBagConstraints gbc;
    private int gbcXTemp;
    private int gbcYtemp;
    private ArrayList<MusicBox> musicBoxes;
    public CenterPanel() {
        setLayout(new GridBagLayout());
     //   setLayout(new GridLayout(3 , 300 , 20 , 20));
        gbc = new GridBagConstraints();
//        JPanel insidePanel = new JPanel();
        setBackground(Color.red);
      //  setLayout(new GridLayout(10, 5, 5, 20));
        setSize(new Dimension(1000 ,30000));
        musicBoxes = new ArrayList<MusicBox>();
        //gbc = new GridBagConstraints();
        //gbc.gridx = 0;
        //gbc.gridy = 0;
       //gbc.anchor = GridBagConstraints.FIRST_LINE_START;
       // gbc.fill = GridBagConstraints.BOTH;
       // gbc.gridheight = 1;
       // gbc.weighty = 1;
       // gbc.weightx = 1;
//        JButton b1 = new JButton("1");
 //       add(b1, gbc);
//
//
//        gbc.gridx = 1;
//        gbc.gridy = 0;
//        JButton b2 = new JButton("2");
//        insidePanel.add(b2, gbc);
//
//
//        gbc.gridx = 0;
//        gbc.gridy = 1;
//        JButton b3 = new JButton("3");
//        insidePanel.add(b3, gbc);
//        JButton b4 = new JButton("4");
//
//
//        gbc.gridx = 1;
//        gbc.gridy = 1;
//        insidePanel.add(b4, gbc);
//        JButton b5 = new JButton("5");
//        JButton b6 = new JButton("6");
//        JButton b7 = new JButton("7");
//        JButton b8 = new JButton("8");
//        JButton b9 = new JButton("9");

        //  add(b1);add(b2);add(b3);add(b4);add(b5);
        // add(b6);add(b7);add(b8);add(b9);

//        insidePanel.setSize(3000,3000);
        //insidePanel.setBackground(Color.YELLOW);

//        JScrollPane scrollPane = new JScrollPane(insidePanel);
//        scrollPane.add(insidePanel);
        //scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//        add(scrollPane,BorderLayout.CENTER);
//        add(scrollPane, BorderLayout.CENTER);
        gbc.gridx = gbcXTemp;
        gbc.gridy = gbcYtemp;

        System.out.println(gbc.gridx + " " + gbc.gridy);
        gbc.insets = new Insets(10 , 10 , 10 , 10);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.gridheight = 1;
        gbc.weighty = 1;
        gbc.weightx = 1;

        setVisible(true);
//        setVisible(true);
    }



    private void addMusicBox()
    {

    }

    private void setGbc()
    {
        gbcXTemp++;

        if(gbcXTemp == 3) {
            gbcXTemp = 0;
            gbcYtemp++;
        }
        gbc.gridx = gbcXTemp;
        gbc.gridy = gbcYtemp;

        gbc.insets = new Insets(10 , 10 , 10 , 10);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.gridheight = 1;
        gbc.weighty = 1;
        gbc.weightx = 1;

    }

    @Override
    public void musicAdded(Song song) {
            MusicBox musicBox = new MusicBox(song);
            musicBoxes.add(musicBox);
            add(musicBox , gbc);
            revalidate();
            setGbc();
    }
}
