class FinalDemo{

    public final void Display(){
        System.out.println("This is a final Method");
    }
}


public class finalMethod extends FinalDemo {
    //try to override a final method
    // public final void Display(){
    //     System.out.println("This final method is overridden..");
    // }
    public static void main(String[] args) {
        finalMethod ob=new finalMethod();
        ob.Display(); 
    }
}
