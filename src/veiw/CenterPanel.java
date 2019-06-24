package veiw;

import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {
    GridBagConstraints gbc;
    public CenterPanel() {
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
//        JPanel insidePanel = new JPanel();
        setBackground(Color.red);
      //  setLayout(new GridLayout(10, 5, 5, 20));
        setSize(new Dimension(30000 ,30000));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
       gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridheight = 1;
        gbc.weighty = 1;
        gbc.weightx = 1;
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
        for (int i = 0; i < 140; i++) {
            MusicBox musicBox = new MusicBox();
            if(i%2==1)
                musicBox.setBackground(Color.green);
          //  add(new JButton("hi") , gbc);
            add(musicBox , gbc);
            setGbc();
        }

//        JScrollPane scrollPane = new JScrollPane(insidePanel);
//        scrollPane.add(insidePanel);
        //scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//        add(scrollPane,BorderLayout.CENTER);
//        add(scrollPane, BorderLayout.CENTER);
        setVisible(true);
//        setVisible(true);
    }




    private void setGbc()
    {
        gbc.gridx++;
        if(gbc.gridx == 3) {

            gbc.gridx = 0;
            gbc.gridy++;
        }
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridheight = 1;
        gbc.weighty = 1;
        gbc.weightx = 1;

    }


}
