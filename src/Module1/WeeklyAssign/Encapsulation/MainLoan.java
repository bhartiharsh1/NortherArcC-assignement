package Module1.WeeklyAssign.Encapsulation;
public class MainLoan {

    public static void main(String[] args) {

        LoanAccount loan = new LoanAccount();

        loan.setBorrowerName("Harsh");
        loan.setAmount(50000);

        System.out.println(loan.getBorrowerName());
        System.out.println(loan.getAmount());
    }
}