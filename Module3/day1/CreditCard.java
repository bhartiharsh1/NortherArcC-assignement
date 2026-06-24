package Module3.day1;
public class CreditCard implements PaymentService{
    @Override
    public void pay(double amt){
        System.out.println(amt+" : Payed through credit card");
    }
}

