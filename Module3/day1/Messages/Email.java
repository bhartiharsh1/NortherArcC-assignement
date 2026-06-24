package Module3.day1.Messages;

public class Email implements Notification{
    @Override
    public void sendMessage(String message) {
        System.out.println("Email: "+message);
    }
}