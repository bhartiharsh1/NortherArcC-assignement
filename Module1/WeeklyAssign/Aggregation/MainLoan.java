package Module1.WeeklyAssign.Aggregation;

public class MainLoan {

    public static void main(String[] args) {

        LoanAccount l1 = new LoanAccount(101);
        LoanAccount l2 = new LoanAccount(102);

        LoanPortfolio portfolio =
                new LoanPortfolio();

        portfolio.addLoan(l1);
        portfolio.addLoan(l2);

        portfolio.showLoans();
    }
}
