
import java.io.Serializable;

class MyBean implements Serializable {

    private String name;

    // No-argument constructor
    public MyBean() {
    }

    // Getter method for the name property
    public String getName() {
        return name;
    }

    // Setter method for the name property
    public void setName(String name) {
        this.name = name;
    }
}

public class Main {

    public static void main(String[] args) {
        // Create an instance of MyBean
        MyBean myBean = new MyBean();

        // Set the name property
        myBean.setName("Alice");

        // Get the name property
        String name = myBean.getName();

        // Print the name
        System.out.println("Name: " + name);
    }
}
