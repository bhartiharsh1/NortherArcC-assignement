package Module2.day6.first;

public class MyThread extends Thread {
private int delay;
    public MyThread(String name,int delay){
        super(name); // // first rule of inheritance is Constructor chaining;
        this.delay=delay;
    }
    @Override
    public void run() {
        for(int i =1; i<10; i++) {
            try {
                Thread.sleep(delay);
                System.out.println(i+" " + this.getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i+" " +Thread.currentThread().getName());
            System.out.println(i+ " " +this.getName());
        }
    }
}
