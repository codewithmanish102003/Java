
public class RecursiveFunc {

    public static int printHello(int count) {
        if (count == 0) {
            return 0;
        } else {
            System.out.println("Hello,World!");
            return printHello(count - 1); //Base Condition
        }
    }

    public static void main(String[] args) {
        printHello(5);
    }
}
