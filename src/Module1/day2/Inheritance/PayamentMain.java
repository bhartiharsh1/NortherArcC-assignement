package Module1.day2.Inheritance;

import java.util.Scanner;

class PaymentMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Choose payment method: 1: Debit Card 2: Credit Card  3: UPI");
        int option = input.nextInt();

        Payments paymentMethod;

        switch (option) {
            case 1:
                paymentMethod = new Debit();
                break;

            case 2:
                paymentMethod = new Credit();
                break;

            case 3:
                input.nextLine();
                System.out.println("Enter UPI ID:");
                String upiIdentifier = input.nextLine();
                paymentMethod = new UpiPayment(upiIdentifier);
                break;

            default:
                System.out.println("Invalid selection");
                return;
        }

        paymentMethod.pay();
    }
}
