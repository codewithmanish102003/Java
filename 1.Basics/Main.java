import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("1. Start\n2. Exit\nEnter choice:");
                choice = sc.nextInt();
                if(choice==2){
                    break;
                }
                System.out.println("Enter a : ");
                int a=sc.nextInt();
                System.out.println("Enter b : ");
                int b=sc.nextInt();
                System.out.println("Sum : "+(a+b));
            } while (choice != 2);
        }
        System.out.println("Exited!");
    }
}