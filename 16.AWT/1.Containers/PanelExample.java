import java.awt.*;
import java.awt.event.*;

public class PanelExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Panel Example");
        Panel panel = new Panel();

        // Create buttons
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");

        // Add action listeners to the buttons
        button1.addActionListener((ActionEvent e) -> {
            System.out.println("Button 1 clicked!");
        });

        button2.addActionListener((ActionEvent e) -> {
            System.out.println("Button 2 clicked!");
        });

        // Add buttons to the panel
        panel.add(button1);
        panel.add(button2);

        // Add panel to the frame
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}