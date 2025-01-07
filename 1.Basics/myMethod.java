
public class myMethod {

    //static Method
    static void myFunc(int x,int y) {
        System.out.println("Hello");
        int z=x+y;
        System.out.println(z);
    }
  
    //non-static methods
    void myFunc2(int x,int y) {
        System.out.println("Hello");
        int z=x+y;
        System.out.println(z);
    }



    public static void main(String[] args) {
        //calling a static function
        myFunc(4,5);
        
         //calling a non-static function
        myMethod obj=new myMethod();
        obj.myFunc2(12, 13);
    }
}
