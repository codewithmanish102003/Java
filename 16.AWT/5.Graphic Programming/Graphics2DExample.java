import java.awt.*;
import java.awt.geom.*;

public class Graphics2DExample extends Frame {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // Set rendering hints for anti-aliasing
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw a rectangle with a thick border
        g2.setStroke(new BasicStroke(5));
        g2.setColor(Color.RED);
        g2.draw(new Rectangle2D.Double(50, 50, 200, 100));

        // Draw a rotated ellipse
        AffineTransform transform = new AffineTransform();
        transform.rotate(Math.toRadians(45), 150, 150);
        g2.setTransform(transform);
        g2.setColor(Color.GREEN);
        g2.fill(new Ellipse2D.Double(100, 100, 100, 50));
    }

    public static void main(String[] args) {
        Graphics2DExample frame = new Graphics2DExample();
        frame.setSize(400, 400);
        frame.setTitle("Graphics2D Example");
        frame.setVisible(true);
    }
}