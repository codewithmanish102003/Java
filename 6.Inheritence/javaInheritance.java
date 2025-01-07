class Base{
    int x;
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base{
    
    void Display(){
        System.out.println("Value of x is: "+getX());
    }

}

    

public class javaInheritance{
    public static void main(String[] args) {
        Derived d = new Derived();
        d.setX(10);
        System.out.println(d.getX());
        d.Display();
}
}



