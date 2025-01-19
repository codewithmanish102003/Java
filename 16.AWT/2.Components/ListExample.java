import java.awt.*;

public class ListExample {
    public static void main(String[] args) {
        Frame frame = new Frame("List Example");
        List list = new List(4, false); // Single selection
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        
        frame.add(list);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}