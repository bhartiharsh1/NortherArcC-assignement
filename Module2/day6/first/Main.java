package Module2.day6.first;

public class Main {
    public static void main(String[] args)  {
        Thread T1 = new MyThread("sachin",500);
        Thread T2 = new MyThread("Rahul",1000);
        Thread T3 = new MyThread("harsh",1500);
        T1.setDaemon(true);
        T2.setDaemon(true);
        T1.start();
        T2.start();
        T3.start();
        System.out.println("existing main thread");
        //parents will wait child to finish then start == Thread Joining
//        try {
//            T1.join();
//            T2.join();
//            T3.join();
//        }catch (InterruptedException e){
//            throw new RuntimeException(e);
//        }
//        System.out.println("active Thread" + Thread.activeCount());
//        for(int i =1; i<10;i++){
//            System.out.println(i+" " + Thread.currentThread().getName());
        }//the parent will run for the child until they finish , but they will run parallelly.
    }
