
class AgeException extends Exception{
    public AgeException(String message){
        super(message);
    }
}

public class CustomExceptionExample {

    public static void validateAge(int age) throws 
    AgeException {
        if (age < 18) {
          throw new AgeException("Age is Not valid");
        } else {
            System.out.println("Age Is valid");
        }
    } 

    public static void main(String[]args){
    try {
        validateAge(15);
    } catch (AgeException e) {
        System.out.println("Exception :"+e.getMessage());
    }
     try {
        validateAge(20);
    } catch (AgeException e) {
        System.out.println("Exception :"+e.getMessage());
    }
} 
    }


