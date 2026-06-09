package Module1.day2.Inheritance;


import java.util.Scanner;

class MainMsg {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Select message type: 1: WhatsApp  2: Email  3: SMS ");
        int option = input.nextInt();

        SimpleMSG message;

        switch (option) {
            case 1:
                message = new WhatsAppMsg();
                ((WhatsAppMsg) message).sendWhatsAppMessage();
                break;

            case 2:
                message = new EmailMSG();
                ((EmailMSG) message).sendEmailMessage();
                break;

            case 3:
                message = new TextMsg();
                ((TextMsg) message).sendTextMessage();
                break;

            default:
                System.out.println("Invalid selection");
                return;
        }

        message.sendMessage();
    }
}