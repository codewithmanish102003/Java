import java.awt.*;
import java.awt.event.*;

public class ButtonExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Button Example");
        Panel panel=new Panel();
        Button button = new Button("Click Me");
        
        button.addActionListener((ActionEvent e) -> {
            System.out.println("Button clicked!");
        });
        
        frame.add(panel);
        panel.add(button);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
