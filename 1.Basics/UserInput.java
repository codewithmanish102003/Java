import java.util.Scanner;  

public class UserInput {  
    public static void main(String[] args) {  
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
             
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            System.out.println("Name: " + name + ", Age: " + age);
        }  
    }  
}