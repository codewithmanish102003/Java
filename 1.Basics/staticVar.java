

public class staticVar{
    // int val=90;
    //can be accesssed directly with class name
    static int val=90;

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        staticVar obj1=new staticVar();
        staticVar obj2=new staticVar();

       System.out.println(staticVar.val);
       System.out.println(obj1.val);
       System.out.println(obj2.val);

       obj1.val=9000;
       System.out.println(obj1.val);
       System.out.println(obj2.val);


    }
}