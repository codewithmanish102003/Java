import java.awt.*;

public class ScrollbarExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Scrollbar Example");
        
        Scrollbar scrollbar = new Scrollbar(Scrollbar.VERTICAL, 50, 10, 0, 100);
        frame.add(scrollbar);
        
        frame.setSize(400, 100);
        frame.setVisible(true);
    }
}