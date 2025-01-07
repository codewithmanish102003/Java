import java.awt.*;
import java.awt.event.*;
public class app extends Frame implements ActionListener{
    public app(){
      Button  button=new Button("Click Me");

        button.addActionListener(this);
        add(button);

        setSize(300,200);
        setLayout(new FlowLayout());
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("Clicked");
    }

    public static void main(String[] args) {
        new app();
    }
}
 