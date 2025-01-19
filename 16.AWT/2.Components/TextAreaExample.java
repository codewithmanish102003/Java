import java.awt.*;

public class TextAreaExample {
    public static void main(String[] args) {
        Frame frame = new Frame("TextArea Example");
        TextArea textArea = new TextArea("This is a text area", 5, 30);
        frame.add(textArea);
        
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
