class myThreadRunnable1 implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread 1 is running");
    }
}

class myThreadRunnable2 implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread 2 is running");
    }
}

public class testThreadRunnable {
    public static void main(String[] args) {
        myThreadRunnable1 obj1=new myThreadRunnable1();
        myThreadRunnable2 obj2=new myThreadRunnable2();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }
}
