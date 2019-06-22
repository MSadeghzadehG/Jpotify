package Views.Center.Right;

import Views.MyPanel;

import java.awt.*;

public class FriendsContainer extends MyPanel {


    public FriendsContainer() {
        init();
    }

    @Override
    protected void init() {
        setOpaque(false);
        GridLayout gridLayout = new GridLayout(2, 1);
        setLayout(gridLayout);
    }
}
