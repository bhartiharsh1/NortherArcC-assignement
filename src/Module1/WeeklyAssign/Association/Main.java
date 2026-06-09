package Module1.WeeklyAssign.Association;
public class Main {

    public static void main(String[] args) {

        CreditAnalyst analyst =
                new CreditAnalyst("Rahul");

        BorrowerPortfolio portfolio =
                new BorrowerPortfolio("Retail Loans");

        analyst.reviewPortfolio(portfolio);
    }
}