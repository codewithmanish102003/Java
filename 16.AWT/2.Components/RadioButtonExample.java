import java.awt.*;

public class RadioButtonExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Radio Button Example");
        CheckboxGroup group = new CheckboxGroup();
        
        Checkbox option1 = new Checkbox("Option 1", group, false);
        Checkbox option2 = new Checkbox("Option 2", group, true);
        
        frame.add(option1);
        frame.add(option2);
        frame.setLayout(new FlowLayout());
        
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}