import java.awt.*;
import java.applet.*;

// Main Applet Class
public class AppletExample extends Applet {
    // Override the init() method to initialize the applet
    @Override
    public void init() {
        // Set the layout to FlowLayout for better component arrangement
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Add a label to the applet
        Label label = new Label("Welcome to the Applet Example!");
        label.setFont(new Font("Arial", Font.BOLD, 16));
        add(label);

        // Add a button to the applet
        Button button = new Button("Click Me");
        button.setBackground(Color.BLUE);
        button.setForeground(Color.WHITE);
        add(button);

        // Set the background color of the applet
        setBackground(Color.LIGHT_GRAY);
    }

    // Override the paint() method to draw custom graphics
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Draw a custom message below the components
        g.setColor(Color.RED);
        g.drawString("This is an improved applet example!", 20, 100);
    }

    // Main method to run the applet as a standalone application
    public static void main(String[] args) {
        Frame frame = new Frame("Applet Example");
        AppletExample applet = new AppletExample();
        frame.add(applet);
        frame.setSize(400, 300);
        frame.setVisible(true);
        applet.init();
        applet.start();
    }
}