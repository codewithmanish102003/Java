import java.awt.*;

public class ImageExample extends Frame {
    Image img;

    public ImageExample() {
        img = Toolkit.getDefaultToolkit().getImage("example.jpg");
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(img, 50, 50, this);
    }

    public static void main(String[] args) {
        ImageExample frame = new ImageExample();
        frame.setSize(400, 400);
        frame.setTitle("Image Example");
        frame.setVisible(true);
    }
}