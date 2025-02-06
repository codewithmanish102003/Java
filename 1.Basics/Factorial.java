
import java.util.Scanner;


public class Factorial {
public static void main(String[] args) {
    System.out.print("Enter the Number : ");
    try (Scanner s = new Scanner(System.in)) {
        int num=s.nextInt();
        int factorial = 1;
        for(int i=1; i<=num;i++){
        factorial = factorial * i;
        }

        System.out.println("factorial of "+num+" is : "+factorial);
    }
}
  
}
