import java.awt.*;

public class RectangleExample extends Frame {
    @Override
    public void paint(Graphics g) {
        // Draw a rectangle outline
        g.setColor(Color.BLUE);
        g.drawRect(50, 50, 100, 50); // Rectangle with top-left corner at (50, 50)

        // Draw a filled rectangle
        g.setColor(Color.GREEN);
        g.fillRect(200, 50, 100, 50); // Filled rectangle at (200, 50)

        // Draw a square
        g.setColor(Color.ORANGE);
        g.drawRect(100, 150, 50, 50); // Square with side 50
    }

    public static void main(String[] args) {
        RectangleExample frame = new RectangleExample();
        frame.setSize(400, 300);
        frame.setTitle("Rectangle Example");
        frame.setVisible(true);
    }
}