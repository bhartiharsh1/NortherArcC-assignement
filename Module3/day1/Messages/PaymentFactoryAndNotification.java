package Module3.day1.Messages;

import Module3.day1.CreditCard;
import Module3.day1.DebitCard;
import Module3.day1.PaymentService;

public class PaymentFactoryAndNotification {
    private static CreditCard creditCard=new CreditCard();
    private static DebitCard debitCard=new DebitCard();
    private static UPI upi=new UPI();

    private static Whatsapp whatsapp=new Whatsapp();
    private static Email email=new Email();

    public static PaymentService getPaymentService(int n){
        switch (n){
            case 1->{return creditCard;}
            case 2->{return debitCard;}
            case 3->{return upi;}
        }
        return null;

    }

    public static Notification getNotificationService(int n){
        switch (n){
            case 1->{return whatsapp;}
            case 2->{return email;}

        }
        return null;
    }
}