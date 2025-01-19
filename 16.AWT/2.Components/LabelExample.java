import java.awt.*;

public class LabelExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Label Example");
        Label label = new Label("This is a label", Label.CENTER);
        frame.add(label);
        
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
