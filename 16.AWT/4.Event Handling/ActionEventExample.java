import java.awt.*;
import java.awt.event.*;

public class ActionEventExample {
    public static void main(String[] args) {
        Frame frame = new Frame("ActionEvent Example");
        Button button = new Button("Click Me");
        
        // Register the listener
        button.addActionListener((ActionEvent e) -> {
            System.out.println("Button clicked!");
        });
        
        frame.add(button, BorderLayout.CENTER);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}