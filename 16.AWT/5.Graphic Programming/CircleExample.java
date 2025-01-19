import java.awt.*;

public class CircleExample extends Frame {
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        
        // Draw the outline of a circle
        g.drawOval(50, 50, 100, 100); // x=50, y=50, width=100, height=100

        // Fill a circle
        g.setColor(Color.RED);
        g.fillOval(200, 50, 100, 100); // x=200, y=50, width=100, height=100
    }

    public static void main(String[] args) {
        CircleExample frame = new CircleExample();
        frame.setSize(400, 200);
        frame.setTitle("Circle Example");
        frame.setVisible(true);
    }
}