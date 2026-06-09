package Module1.WeeklyAssign.Aggregation;
import java.util.ArrayList;

public class LoanPortfolio {

    private ArrayList<LoanAccount> loans =
            new ArrayList<>();

    public void addLoan(LoanAccount loan) {
        loans.add(loan);
    }

    public void showLoans() {
        for(LoanAccount l : loans) {
            System.out.println(l.getLoanId());
        }
    }
}