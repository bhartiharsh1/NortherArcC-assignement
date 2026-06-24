package Module2.day6.Second;

public class Main2 {
    public static void main(String[] args) {
        for(int i=1; i<=100;i++)
            new Thread(()-> {
                for (int j = 1; j < 100; j++) {
                    System.out.println(j + " " + Thread.currentThread().getName());
                }
            }).start();

        System.out.println("existing");
    }
}
