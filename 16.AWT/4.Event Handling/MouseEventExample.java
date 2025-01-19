
import java.awt.*;
import java.awt.event.*;

public class MouseEventExample {

    public static void main(String[] args) {
        Frame frame = new Frame("MouseEvent Example");

        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked at: " + e.getX() + ", " + e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
