package Views;

import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Listeners {

    private static MouseListener frameMove = new MouseInputListener() {
        Point mouseLastCoordinate;

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            mouseLastCoordinate = null;
        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseDragged(MouseEvent e) {
            if (e.getY() > 50) {
                return;
            }
            if (mouseLastCoordinate != null) {
                int deltaX = e.getLocationOnScreen().x - mouseLastCoordinate.x;
                int deltaY = e.getLocationOnScreen().y - mouseLastCoordinate.y;
                Frame.singelFrame().setLocation(
                        Frame.singelFrame().getLocationOnScreen().x + deltaX,
                        Frame.singelFrame().getLocationOnScreen().y + deltaY);
            }
            mouseLastCoordinate = e.getLocationOnScreen();
        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }
    };


    public static MouseListener getFrameMove() {
        return frameMove;
    }

}
