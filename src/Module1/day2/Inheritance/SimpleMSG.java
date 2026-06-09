package Module1.day2.Inheritance;

import java.util.Scanner;

class SimpleMSG {

    protected String message;

    SimpleMSG() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type your message:");
        message = input.nextLine();
    }

    void sendMessage() {
        System.out.println("Message delivered: " + message);
    }

    public void sendEmailMessage() {
    }

    public void sendTextMessage() {
    }
}
