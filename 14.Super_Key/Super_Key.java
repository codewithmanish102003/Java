class  Base{
   public int a;
    Base(int a){
        this.a=a;
    }
}

class Derived extends Base{
int b=10;
    Derived(){
        super(10);
        System.out.println("I am a Derived Class Constructor");
    }
}

public class Super_Key{
    public static void main(String[] args){
        Derived d=new Derived();
        System.out.println(d.b);
        }
}