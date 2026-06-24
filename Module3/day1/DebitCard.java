package Module3.day1;
public class DebitCard implements PaymentService{
    @Override
    public void pay(double amt){
        System.out.println(amt+" : Payed through debit card");
    }
}

