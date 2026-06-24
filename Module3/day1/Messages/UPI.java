package Module3.day1.Messages;

import Module3.day1.PaymentService;

public class UPI implements PaymentService {
    @Override
    public void pay(double amt) {
        System.out.println(amt+" : Payed through UPI");
    }
}

