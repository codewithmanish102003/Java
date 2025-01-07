public class TestException {

    public static void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division By Zero");
        }
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally Block is Executed");
        }
    }
}
