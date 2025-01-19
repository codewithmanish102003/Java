import java.awt.*;

public class TextExample extends Frame {
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.setFont(new Font("Serif", Font.BOLD, 24));
        g.drawString("Hello, Graphics!", 50, 100);
    }

    public static void main(String[] args) {
        TextExample frame = new TextExample();
        frame.setSize(300, 200);
        frame.setTitle("Text Example");
        frame.setVisible(true);
    }
}