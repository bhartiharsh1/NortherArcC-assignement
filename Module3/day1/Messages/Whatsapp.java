package Module3.day1.Messages;

public class Whatsapp implements Notification{
    @Override
    public void sendMessage(String message) {
        System.out.println("WhatsApp: "+message);
    }
}