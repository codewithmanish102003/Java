import java.awt.*;
import java.awt.event.*;

public class FrameExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Frame Example");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Create a button
        Button button = new Button("Button");

        // Add ActionListener to the button
        button.addActionListener((ActionEvent e) -> {
            // Define the action to be performed when the button is clicked
            System.out.println("Button clicked!");
        });

        // Add the button to the frame
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);
    }
}