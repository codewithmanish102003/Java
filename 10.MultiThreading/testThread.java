class MyThread1 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread 1 is running");
        int i=0;
        while(i<200){
            System.out.println("I am Happy");
            i++;
            }
}}

class MyThread2 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread 2 is running");
        int i=0;
        while(i<200){
            System.out.println("I am sad");
            i++;
            }
}}


public class testThread {
    public static void main(String[] args) {
        MyThread1 obj1=new MyThread1();
        MyThread2 obj2=new MyThread2();
        obj1.start();
        obj2.start();
    }
}
