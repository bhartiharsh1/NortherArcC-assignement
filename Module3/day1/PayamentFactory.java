package Module3.day1;
import Module3.day1.Messages.UPI;

import java.util.Scanner;
public class PayamentFactory {
    private static CreditCard creditCard=new CreditCard();
    private static DebitCard  debitCard = new DebitCard();
    private static UPI upi = new UPI();
    public static  PaymentService getPaymentService(String paymentType){
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the option: 1-> UPI, 2-> CreditCard, 3-> DebitCard, 0-> Exit");
            int option = sc.nextInt();
switch (option){
                case 1:
                    return creditCard;

                case 2:
                    return debitCard;

                case 3:
                    return upi;

                default:
                    System.out.println("Invalid option");
                    return null;
            }
        }
    }
}
