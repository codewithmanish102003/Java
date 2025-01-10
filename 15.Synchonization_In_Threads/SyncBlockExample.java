class Counter1 {
    private int count=0;
    public void increment() {
        // synchronized block
        synchronized(this) {
            count++;
            
        }
    }

    public int getCount() {
        return count;
    }
}

public class SyncBlockExample {
    public static void main(String[] args) throws InterruptedException{
        Counter1 count=new Counter1();
        Thread t1=new Thread(()->{
          for (int i = 0; i < 1000; i++) {
              count.increment();
          }
        });

        Thread t2=new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                count.increment();
            }
          });

          t1.start();
          t2.start();
          t1.join();
          t2.join();
          System.out.println("Count: "+count.getCount());
    }}