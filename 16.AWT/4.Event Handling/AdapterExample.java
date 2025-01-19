import java.awt.*;
import java.awt.event.*;

public class AdapterExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Adapter Example");
        
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked using adapter!");
            }
        });
        
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}