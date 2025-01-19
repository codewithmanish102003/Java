import java.awt.*;

public class BasicShapes extends Frame {
    @Override
    public void paint(Graphics g) {
        // Set color
        g.setColor(Color.BLUE);

        // Draw a line
        g.drawLine(50, 50, 200, 50);

        // Draw a rectangle
        g.drawRect(50, 70, 150, 100);
        g.fillRect(50, 70, 150, 100);

        // Draw an oval
        g.drawOval(50, 200, 150, 100);
        g.fillOval(50, 200, 150, 100);

        

        // Draw a polygon
        int[] xPoints = {50, 100, 150};
        int[] yPoints = {350, 300, 350};
        g.drawPolygon(xPoints, yPoints, 3);
    }

    public static void main(String[] args) {
        BasicShapes frame = new BasicShapes();
        frame.setSize(400, 400);
        frame.setTitle("Basic Shapes Example");
        frame.setVisible(true);
    }
}