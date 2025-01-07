class Counter{
    private int count=0;
    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}

public class SyncMethodExample{
    public static void main(String[] args) throws InterruptedException{
        Counter count=new Counter();
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
    }
}