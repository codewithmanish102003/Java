import java.awt.*;

public class ChoiceExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Choice Example");
        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");
        
        frame.add(choice);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}