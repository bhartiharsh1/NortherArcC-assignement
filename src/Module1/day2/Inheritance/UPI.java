package Module1.day2.Inheritance;

class UpiPayment extends Payments {

    String upiIdentifier;

    UpiPayment(String upiIdentifier) {
        this.upiIdentifier = upiIdentifier;
    }

    void showUpiDetails() {
        System.out.println("UPI Identifier: " + upiIdentifier);
    }

    void pay() {
        super.pay();
        System.out.println("Payment completed successfully using UPI ID: " + upiIdentifier);
    }
}

