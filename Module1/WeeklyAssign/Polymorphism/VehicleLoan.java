package Module1.WeeklyAssign.Polymorphism;
public class VehicleLoan extends Loan {

    @Override
    public void disburseLoan() {
        System.out.println("Pay directly to dealer");
    }
}