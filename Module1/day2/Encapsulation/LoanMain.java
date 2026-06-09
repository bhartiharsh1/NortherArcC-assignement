package Module1.day2.Encapsulation;

class LoanMain {
    public static void main(String[] args) {
        Loan loan = new Loan();
        loan.setCustomerName("John Doe");
        loan.setLoanAmount(10000);


        System.out.println("Customer Name: " + loan.getCustomerName());
        System.out.println("Loan Amount: " + loan.getLoanAmount());
    }
}
