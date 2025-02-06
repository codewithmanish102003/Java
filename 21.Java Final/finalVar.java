public class finalVar {
    public static void main(String[] args) {
        final int NUM=32;
        //finalVar.java:5: error: cannot assign a value to final variable NUM
        // NUM=21;

        System.out.println("Num = "+NUM);
    }
}
