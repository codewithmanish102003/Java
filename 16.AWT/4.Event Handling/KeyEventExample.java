import java.awt.*;
import java.awt.event.*;

public class KeyEventExample {
    public static void main(String[] args) {
        Frame frame = new Frame("KeyEvent Example");
        TextField textField = new TextField();
        
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Key Typed: " + e.getKeyChar());
            }
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Key Pressed: " + e.getKeyCode());
            }
            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Key Released: " + e.getKeyCode());
            }
        });
        
        frame.add(textField, BorderLayout.CENTER);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
