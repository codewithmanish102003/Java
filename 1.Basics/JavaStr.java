
public class JavaStr {

    public static void main(String[] args) {
        String txt = "Manish";
        System.out.println(txt);
        //length of string
        System.out.println(txt.length());

        String Name = "   Manish Prajapati   ";
        System.out.println(Name.trim());

        System.out.println(Name.substring(3, 7));

        System.out.println(txt.startsWith("Ma"));

        System.out.println(txt + " is my Brother");

    }
}
