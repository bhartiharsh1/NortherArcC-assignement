package Module2.Day3.Stream.dao;

import Module2.Day3.Stream.Entity.Loan;

import java.util.List;

public interface LoanDao {
    void save(Loan l);
    Iterable<Loan> findAll();
    Loan findById(int id);
    List<Loan> loanIncrease (int inc);
    List<Loan> sortList(int sort);
    void maxLoan();
    void minLoan();
//    void Avg();

    Iterable<Loan> findByLoanStatus(String loanStatus);
    Iterable<Loan> findByLoanType(String loanType);
}

