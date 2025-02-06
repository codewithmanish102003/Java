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

@SuppressWarnings("unused")
class ConstructorINheritance{
    public static void main(String[] args) {
        DerivedC d=new DerivedC();
    }
}