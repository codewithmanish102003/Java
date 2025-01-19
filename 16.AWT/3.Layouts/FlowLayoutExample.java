
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("FlowLayout Example");
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10)); // Left aligned with gaps

        frame.add(new Button("Button 1"));
        frame.add(new Button("Button 2"));
        frame.add(new Button("Button 3"));

        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
