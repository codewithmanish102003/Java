import java.awt.*;

public class AWTExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Components Example");
        frame.setLayout(new FlowLayout());

        // Add components
        frame.add(new Label("Enter Name:"));
        frame.add(new TextField(20));
        frame.add(new Button("Submit"));
        frame.add(new Checkbox("Accept Terms"));
        
        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        frame.add(choice);
        
        List list = new List(4);
        list.add("Item 1");
        list.add("Item 2");
        frame.add(list);
        
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}