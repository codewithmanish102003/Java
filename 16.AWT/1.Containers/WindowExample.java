import java.awt.*;

public class WindowExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Parent Frame");
        Window window = new Window(frame); // Child of frame
        
        window.setSize(200, 100);
        window.setLayout(new BorderLayout());
        window.add(new Label("This is a window"));
        
        frame.setSize(400, 300);
        frame.setVisible(true);
        window.setVisible(true);
    }
}
