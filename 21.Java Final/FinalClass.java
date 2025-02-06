
// public final class FinalClass {
public class FinalClass{
    public void Display(){
        System.out.println("Hello this a final class method");
    }
}

//trying to override a final class
class Main extends FinalClass{
    @Override
    public void Display(){
        System.out.println("final class can't be extended");
    }

    public static void main(String[] args) {
        Main ob=new Main();
        ob.Display();
    }
}
