package Module2.WeeklyAssignment.Loan.Entity;

public class Loan {
    private int loanid;
    private String loanType;
    private int loanAmount;
    private String loanStatus;
    private double interest;
    private int tenure;

    public Loan() {}

    public Loan(String loanType, int loanAmount, String loanStatus, double interest, int tenure) {
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        this.loanStatus = loanStatus;
        this.interest = interest;
        this.tenure = tenure;
    }

    public Loan(int loanid, String loanType, int loanAmount, String loanStatus, double interest, int tenure) {
        this.loanid = loanid;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        this.loanStatus = loanStatus;
        this.interest = interest;
        this.tenure = tenure;
    }

    @Override
    public String toString() {
        return (loanid + " | " + loanType + " | Amount: " + loanAmount + " | Status: " + loanStatus + " | Interest: " + interest + "% | Tenure: " + tenure + " months");
    }

    public int getLoanid() { return loanid; }
    public void setLoanid(int loanid) { this.loanid = loanid; }

    public String getLoanType() { return loanType; }
    public void setLoanType(String loanType) { this.loanType = loanType; }

    public int getLoanAmount() { return loanAmount; }
    public void setLoanAmount(int loanAmount) { this.loanAmount = loanAmount; }

    public String getLoanStatus() { return loanStatus; }
    public void setLoanStatus(String loanStatus) { this.loanStatus = loanStatus; }

    public double getInterest() { return interest; }
    public void setInterest(double interest) { this.interest = interest; }

    public int getTenure() { return tenure; }
    public void setTenure(int tenure) { this.tenure = tenure; }
}