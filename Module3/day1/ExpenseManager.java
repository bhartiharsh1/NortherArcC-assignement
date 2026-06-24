package Module3.day1;


class ExpenseManager {

    private PaymentService paymentService;


    public ExpenseManager(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void payElectricityBill(double amount) {
        System.out.println("Pay electricity bill " + amount);
        paymentService.pay(amount);
        System.out.println("Electricity bill paid");
    }

    public void payWaterBill(double amount) {
        System.out.println("Pay Water bill " + amount);
        paymentService.pay(amount);
        System.out.println("Water bill paid");
    }

    public void payGASBill(double amount) {
        System.out.println("Pay GAS bill " + amount);
        paymentService.pay(amount);
        System.out.println("GAS bill paid");
    }
}
