package Module1.WeeklyAssign.Association;
public class CreditAnalyst {

    private String name;

    public CreditAnalyst(String name) {
        this.name = name;
    }

    public void reviewPortfolio(BorrowerPortfolio portfolio) {
        System.out.println(name +
                " is reviewing " +
                portfolio.getPortfolioName());
    }
}