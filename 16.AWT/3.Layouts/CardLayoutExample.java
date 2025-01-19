import java.awt.*;

public class CardLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("CardLayout Example");
        frame.setLayout(new BorderLayout());
        
        CardLayout cardLayout = new CardLayout();
        Panel cardPanel = new Panel(cardLayout);
        
        Button nextButton = new Button("Next");
        nextButton.addActionListener(e -> cardLayout.next(cardPanel));
        
        cardPanel.add(new Label("Card 1"), "Card1");
        cardPanel.add(new Label("Card 2"), "Card2");
        
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(nextButton, BorderLayout.SOUTH);
        
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}