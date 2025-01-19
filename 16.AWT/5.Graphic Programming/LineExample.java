import java.awt.*;

public class LineExample extends Frame {
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK); // Set the color for the line

        // Draw a single line
        g.drawLine(50, 50, 200, 50); // Line from (50,50) to (200,50)

        // Draw a diagonal line
        g.setColor(Color.RED);
        g.drawLine(50, 100, 200, 200); // Line from (50,100) to (200,200)
    }

    public static void main(String[] args) {
        LineExample frame = new LineExample();
        frame.setSize(300, 300);
        frame.setTitle("Line Example");
        frame.setVisible(true);
    }
}