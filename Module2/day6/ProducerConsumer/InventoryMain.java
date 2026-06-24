package Module2.day6.ProducerConsumer;

public class InventoryMain {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Thread producer = new Thread(() -> {
            try {
                int i = 1;
                while (i <= 1000) {
                    synchronized (inventory) {
                        while (inventory.size() >= 100) {
                            System.out.println("Inventory full → Producer waiting...");
                            inventory.wait();
                        }
                        String item = "item_" + i;
                        inventory.add(item);
                        System.out.println("Produced: " + item);
                        i++;
                        inventory.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        // CONSUMER THREAD
        Thread consumer = new Thread(() -> {
            try {
                int i = 1;
                while (i <= 1000) {
                    synchronized (inventory) {
                        while (inventory.size() <= 0) {
                            System.out.println("Inventory empty → Consumer waiting...");
                            inventory.wait();
                        }
                        String item = inventory.remove();
                        System.out.println("Consumed: " + item);
                        i++;
                        inventory.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        producer.start();
        consumer.start();
    }
}
