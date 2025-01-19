import java.awt.*;

public class GridBagLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("GridBagLayout Example");
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0; gbc.gridy = 0;
        frame.add(new Button("Button 1"), gbc);
        
        gbc.gridx = 1; gbc.gridy = 0;
        frame.add(new Button("Button 2"), gbc);
        
        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 2;
        frame.add(new Button("Button 3"), gbc);
        
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}