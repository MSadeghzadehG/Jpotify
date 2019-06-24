package veiw;

import javax.swing.*;

import java.awt.Color;
        import java.awt.Container;
        import java.awt.Dimension;
        import java.awt.EventQueue;
        import java.awt.GridBagConstraints;
        import java.awt.GridBagLayout;
        import java.awt.Toolkit;
        import javax.swing.JFrame;
        import javax.swing.JLabel;
        import javax.swing.JPanel;

public class TestFrame {
    private JFrame theFrame = null;

    public TestFrame()
    {
        theFrame = new JFrame("SmallExample");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = theFrame.getContentPane();

        contentPane.setLayout(new GridBagLayout());

        // Place the first content panel
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        contentPane.add(new ContentPanel(Color.RED, "First Content Panel"), gbc);

        // Place the second content panel
        gbc.weighty = 0.5;
        contentPane.add(new ContentPanel(Color.CYAN, "Second Content Panel"), gbc);

        // Place the third content panel
        // Note that with a weighty of 1.0, the third panel floats in the
        // vertical space remaining in the application frame, rather than
        // scooting up under the second content panel.

        // If I change weighty to something like 500.0, then it sits up
        // under the second content panel just fine.
        gbc.weighty = 1.0;
        contentPane.add(new ContentPanel(Color.BLUE, "Third Content Panel"), gbc);


        theFrame.setSize(500, 400);
        // Place the main frame in the center of the display
        Toolkit tk = theFrame.getToolkit();
        Dimension sizeScreen = tk.getScreenSize();
        Dimension sizeFrame = theFrame.getSize();
        theFrame.setLocation(((sizeScreen.width - sizeFrame.width) / 2),
                ((sizeScreen.height - sizeFrame.height) / 2));
        theFrame.setVisible(true);
    } // constructor SmallExample()


    @SuppressWarnings("serial")
    class ContentPanel extends JPanel
    {
        public ContentPanel(Color bgColor, String title)
        {
            this.setBackground(bgColor);
        //    setPreferredSize(new Dimension(100,50));
            JLabel label = new JLabel(title);
            add(label);
        }  // constructor ContentPanel()
    } // class ContentPanel extends JPanel


    /**
     * main.
     * @param args
     */
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestFrame();
            }
        });

    } // public static void main(String [])

}
