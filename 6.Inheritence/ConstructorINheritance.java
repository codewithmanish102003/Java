class BaseC{
    BaseC(){
        System.out.println("Base Constructor Called");
    }
}

class DerivedC extends BaseC{
    DerivedC(){
        System.out.println("Derived Constructor Called");
    }
}

public class ConstructorINheritance{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        DerivedC d=new DerivedC();
    }
}