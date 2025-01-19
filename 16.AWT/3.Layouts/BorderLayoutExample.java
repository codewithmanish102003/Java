import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("BorderLayout Example");
        frame.setLayout(new BorderLayout(10, 5)); // Horizontal and vertical gaps
        
        frame.add(new Button("North"), BorderLayout.NORTH);
        frame.add(new Button("South"), BorderLayout.SOUTH);
        frame.add(new Button("East"), BorderLayout.EAST);
        frame.add(new Button("West"), BorderLayout.WEST);
        frame.add(new Button("Center"), BorderLayout.CENTER);
        
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}