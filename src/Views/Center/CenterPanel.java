package Views.Center;

import Views.Center.Left.LeftPanel;
import Views.Center.Middle.MidPanel;
import Views.Center.Right.RightPanel;
import Views.MyPanel;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicSplitPaneDivider;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.*;

public class CenterPanel extends MyPanel {

    public CenterPanel() {
        init();
    }



    @Override
    protected void init() {
        BorderLayout borderLayout = new BorderLayout(0, 0);
        setLayout(borderLayout);
        JSplitPane leftAndMid = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new LeftPanel(), new MidPanel());
        JSplitPane right = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftAndMid, new RightPanel());
        right.setResizeWeight(0.85);
        leftAndMid.setResizeWeight(0.15);
        adaptDivider(right);
        adaptDivider(leftAndMid);
        add(right);
    }

    private void adaptDivider(JSplitPane splitPane) {
        splitPane.setUI(new BasicSplitPaneUI() {
            public BasicSplitPaneDivider createDefaultDivider() {
                return new BasicSplitPaneDivider(this) {
                    public void setBorder(Border b) {
                    }
                    @Override
                    public void paint(Graphics g) {
                        g.setColor(new Color(0x121212));
                        g.fillRect(0, 0, getSize().width, getSize().height);
                        super.paint(g);
                    }
                };
            }
        });
        splitPane.setBorder(null);
        splitPane.setContinuousLayout( true );
        splitPane.setDividerSize(2);
    }

}
