import java.awt.*;

public class EllipseExample extends Frame {
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        
        // Draw the outline of an ellipse
        g.drawOval(50, 50, 150, 100); // x=50, y=50, width=150, height=100

        // Fill an ellipse
        g.setColor(Color.ORANGE);
        g.fillOval(250, 50, 100, 50); // x=250, y=50, width=100, height=50
    }

    public static void main(String[] args) {
        EllipseExample frame = new EllipseExample();
        frame.setSize(400, 200);
        frame.setTitle("Ellipse Example");
        frame.setVisible(true);
    }
}