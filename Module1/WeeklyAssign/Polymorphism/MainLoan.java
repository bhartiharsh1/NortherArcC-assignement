package Module1.WeeklyAssign.Polymorphism;
public class MainLoan {

    public static void main(String[] args) {

        Loan l1 = new GoldLoan();
        Loan l2 = new VehicleLoan();

        l1.disburseLoan();
        l2.disburseLoan();
    }
}