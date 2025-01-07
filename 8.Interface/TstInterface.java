
interface MyInterface {

    void greet();
}

public class TstInterface {

    public static void main(String[] Args) {
        // // Creating an "object" of the interface using an anonymous class
        // MyInterface obj = new MyInterface() {
        //     @Override
        //     public void greet() {
        //         System.out.println("Hello");
        //     }
        // };

        // Using a lambda expression to create an "object" of the interface
        MyInterface obj = () -> 
            System.out.println("Hello");
        

        obj.greet();

    }
}
