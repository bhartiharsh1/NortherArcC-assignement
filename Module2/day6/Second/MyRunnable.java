package Module2.day6.Second;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=1; i<=100;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
