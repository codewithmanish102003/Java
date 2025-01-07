public class Calculator{

    public void greet(){
        System.out.println("Hiiii...I am a function");
    }
   public Calculator(int a,int b){
    int res=a+b;
    System.out.println("the sum of "+a+" and "+b+" is = "+res);
    }
    public Calculator(double a,double b){
        double res=a+b;
        System.out.println("the sum of "+a+" and "+b+" is = "+res);
        }

    public static void main(String[] args) {
        Calculator sum=new Calculator(12, 13);
        sum.greet();
    }
        
}