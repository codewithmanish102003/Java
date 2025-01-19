import java.awt.*;

public class CheckboxExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Checkbox Example");
        Checkbox checkbox = new Checkbox("Enable notifications", true);
        frame.add(checkbox);
        
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}