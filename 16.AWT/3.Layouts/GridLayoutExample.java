import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("GridLayout Example");
        frame.setLayout(new GridLayout(2, 3, 5, 5)); // 2 rows, 3 columns with gaps
        
        for (int i = 1; i <= 6; i++) {
            frame.add(new Button("Button " + i));
        }
        
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
