import java.awt.*;
import java.awt.event.*;

public class WindowEventExample {
    public static void main(String[] args) {
        Frame frame = new Frame("WindowEvent Example");
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing!");
                System.exit(0);
            }
        });
        
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}