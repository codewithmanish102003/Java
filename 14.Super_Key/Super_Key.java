class  Base2{
   public int a;
    Base2(int a){
        this.a=a;
    }
}

class Derived2 extends Base2{
int b=10;
    Derived2(){
        super(10);
        System.out.println("I am a Derived Class Constructor");
    }
}

public class Super_Key{
    public static void main(String[] args){
        Derived2 d=new Derived2();
        System.out.println(d.b);
        }
}