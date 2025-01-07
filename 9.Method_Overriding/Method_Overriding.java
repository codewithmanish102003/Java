class Animal{

  void eat(){
        System.out.println("Animal Is Eating.......");
    }
}

class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("Dog Is Eating Bones.......");
    }

    // void bark(){
    //     System.out.println("Dog is Barking........");
    // }

}


public class Method_Overriding{

    public static void main(String[] args) {
        Animal A=new  Animal();
        A.eat();

        Animal D=new Dog();// IS A Relationship
        D.eat();
        // D.bark(); Cause Error Beacuse it does not follow the principal of Dynamic Method Dispatch
    }

}