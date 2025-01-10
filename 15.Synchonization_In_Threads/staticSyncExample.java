
class SyncCounter{
    private static int count=0;
    public static synchronized void increment(){
      count++;
    }

    public static int getCount(){
        return count;
    }
}

public class staticSyncExample {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws InterruptedException{
        SyncCounter count=new SyncCounter();
        Thread t1=new Thread(()->{
          for (int i = 0; i < 1000; i++) {
            SyncCounter.increment();
          }
        });

        Thread t2=new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                SyncCounter.increment();
            }
          });

          t1.start();
          t2.start();
          t1.join();
          t2.join();
          System.out.println("Count: "+SyncCounter.getCount());
    }
}
