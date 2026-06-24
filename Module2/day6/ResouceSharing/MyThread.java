//
//package Module2.day6.ResouceSharing;
//
//import java.io.*;
//
//public class MyThread extends Thread {
//    public static OutputStream destinationwriter;
//    private InputStream sourcereader;
//
//    public MyThread(String name, String sourcereader) {
//        super(name);
//        this.sourcereader = sourcereader;
//    }
//
//    // Use throws instead of try-catch
//    public static void openDestinationWrite() throws FileNotFoundException {
//        destinationwriter = new FileOutputStream("output.log");
//    }
//
//    // Use throws correctly
//    public static void closeDestinationWriter() throws IOException {
//        destinationwriter.close();
//    }
//
//    // Helper method to move checked exceptions out of run()
//    private void copyData() throws IOException {
//        int c;
//        while ((c = sourcereader.read()) != -1) {
//            destinationwriter.write(c);
//        }
//    }
//
//    @Override
//    public void run() {
//        synchronized (destinationwriter) {
//            System.out.println("Thread name: " + Thread.currentThread().getName());
//
//            try {
//                copyData();  // throws IOException
//                sourcereader.close();
//            } catch (IOException e) {
//                // Required because run() cannot declare throws
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
