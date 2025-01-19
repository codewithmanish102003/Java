import java.awt.*;
import java.awt.event.*;

public class DialogExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Dialog Example");
        Dialog dialog = new Dialog(frame, "Modal Dialog", true);
        
        dialog.setSize(200, 150);
        dialog.setLayout(new FlowLayout());
        dialog.add(new Label("This is a dialog"));
        
        // Create a button and add an ActionListener
        Button closeButton = new Button("Close");
        closeButton.addActionListener((ActionEvent e) -> {
            dialog.dispose(); // Close the dialog when the button is clicked
        });
        dialog.add(closeButton);
        
        frame.setSize(400, 300);
        frame.setVisible(true);
        dialog.setVisible(true);
    }
}