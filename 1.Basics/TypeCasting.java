/**
 * TypeCasting
 */
public class TypeCasting {

    public static void main(String[] args) {
        System.out.println("Hello,World!");
        int a=9;
        double b=a; //implicit Type Casting(widening)
        double myDouble=9.78;
        int myInt=(int)myDouble;//explicit Type casting(narrowing)
        System.out.println("implicit Type Casting(widening)");
        System.out.println("Addition of "+a+" and "+b+" is : "+(a+b));
        System.out.println("explicit Type casting(narrowing)");
        System.out.println("myDouble = "+myDouble+" and myInt = "+myInt);
        

    }
}