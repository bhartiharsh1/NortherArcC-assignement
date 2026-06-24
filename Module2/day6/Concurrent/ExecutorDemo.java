package Module2.day6.Concurrent;


import java.util.concurrent.*;

public class ExecutorDemo {

    public static void main(String[] args) {
        ExecutorService executor =
                Executors.newFixedThreadPool(4);
        for(int i=1;i<=100;i++) {
            int taskId = i;
            executor.execute(() -> {
                System.out.println(
                        "Task "
                                + taskId
                                + " executed by "
                                + Thread.currentThread().getName()
                );
            });
        }
        executor.shutdown();

    }

}
