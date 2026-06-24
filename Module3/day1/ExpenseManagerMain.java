
package Module3.day1;

import Module3.day1.Messages.UPI;

import java.util.Scanner;

public class ExpenseManagerMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExpenseManager expenseManager = null;

        while (true) {

            System.out.println("Enter the option: 1-> UPI, 2-> CreditCard, 3-> DebitCard, 0-> Exit");
            int option = sc.nextInt();

            switch (option) {

                case 1:
                    expenseManager = new ExpenseManager(new UPI());
                    break;

                case 2:
                    expenseManager = new ExpenseManager(new CreditCard());
                    break;

                case 3:
                    expenseManager = new ExpenseManager(new DebitCard());
                    break;

                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option");
                    continue;
            }

            // perform operations only if valid option chosen
            expenseManager.payElectricityBill(1000);
            expenseManager.payWaterBill(200);
            expenseManager.payGASBill(100);
        }
    }
}