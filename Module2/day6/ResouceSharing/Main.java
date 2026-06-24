//package Module2.day6.ResourceSharing;
//
//import Module2.day6.ResouceSharing.MyThread;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//
//public class Main  {
//
//    public static void main(String[] args) {
//
//        try {
//            Thread t1 = new MyThread("sachine", "Sachine.txt");
//            Thread t2 = new MyThread("raghav", new FileInputStream("raghav.txt"));
//
//            MyThread.openDestinationWriter();
//
//            t1.start();
//            t2.start();
//
//            t1.join();
//            t2.join();
//
//            MyThread.closeDestinationWriter();
//
//            System.out.println("Exiting main");
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}