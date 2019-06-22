package Views;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    private MainPanel mainPanel;
    private Dimension defaultDimension;
    private ComponentResizer componentResizer;
    private static Frame frame = new Frame("Jpotify");
    private Frame(String title) {
        super(title);
        mainPanel = new MainPanel();
        defaultDimension = new Dimension(1280, 720);
        componentResizer = new ComponentResizer();
        init();
    }

    private void init() {
        componentResizer.registerComponent(this);
        setUndecorated(true);
        setMinimumSize(defaultDimension);
        setSize(defaultDimension);
        setResizable(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        getContentPane().add(mainPanel);
        setVisible(true);
    }


    public static Frame singelFrame() {
        return frame;
    }

}
