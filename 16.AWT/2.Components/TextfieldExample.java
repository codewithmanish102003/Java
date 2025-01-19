import java.awt.*;

public class TextfieldExample {
    public static void main(String[] args) {
        Frame frame = new Frame("TextField Example");
        Panel panel=new Panel();
        TextField textField = new TextField("Enter text here", 20);
        frame.add(panel);
        panel.add(textField);
        
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
