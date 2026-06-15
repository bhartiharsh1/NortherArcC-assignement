package Module2.day3.Stream.Entity;


public class Loan {
    private int id;
    private int loanAmount;
    private int loanTenure;
    private String loanStatus;
    private int loanInterest;
    private String loanType;

    public Loan(int id, int loanAmount, int loanTenure, String loanStatus, int loanInterest, String loanType) {
        this.id = id;
        this.loanAmount = loanAmount;
        this.loanTenure = loanTenure;
        this.loanStatus = loanStatus;
        this.loanInterest=loanInterest;
        this.loanType=loanType;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getLoanTenure() {
        return loanTenure;
    }

    public void setLoanTenure(int loanTenure) {
        this.loanTenure = loanTenure;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public int getLoanInterest() {
        return loanInterest;
    }

    public void setLoanInterest(int loanInterest) {
        this.loanInterest = loanInterest;
    }

    public String getLoan() {
        return loanType;
    }




    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", loanAmount=" + loanAmount +
                ", loanTenure=" + loanTenure +
                ", loanStatus='" + loanStatus + '\'' +
                ", loanInterest=" + loanInterest +
                ", loanType='" + loanType + '\'' +
                '}';
    }

}

