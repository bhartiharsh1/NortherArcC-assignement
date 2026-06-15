package Module2.Day3.Stream.dao;

import Module2.Day3.Stream.Entity.Loan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LaoDaoImplementor implements LoanDao {
    private List<Loan> list = new ArrayList<>();

    @Override
    public void save(Loan l) {
        list.add(l);
    }

    @Override
    public Iterable<Loan> findAll() {
        return list;
    }

    @Override
    public Loan findById(int id) {
        return list.stream().filter(l -> l.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Loan> loanIncrease(int inc) {
        return list.stream().map(loanIncrease -> {
            loanIncrease.setLoanInterest(loanIncrease.getLoanInterest() + 2);
            return loanIncrease;
        }).toList();

    }

    @Override
    public List<Loan> sortList(int sort) {
        return list.stream().sorted(Comparator.comparing(Loan::getLoan).reversed().thenComparing(Loan::getLoanInterest)).toList();
    }


    @Override
    public Iterable<Loan> findByLoanStatus(String loanStatus) {
        return list.stream().filter(loan -> loan.getLoanStatus().equalsIgnoreCase(loanStatus)).toList();
    }

    @Override
    public Iterable<Loan> findByLoanType(String loanType) {
        return list.stream().filter(loan -> loan.getLoan().equalsIgnoreCase(loanType)).toList();
    }

    @Override
    public void maxLoan() {

        System.out.println("max");
        System.out.println(list.stream().max((Loan1, Loan2) -> Loan1.getLoanAmount() - Loan2.getLoanAmount()));
    }
    @Override
    public void minLoan() {
        System.out.println("min");
        System.out.println(list.stream().min((Loan1, Loan2) -> Loan1.getLoanAmount() - Loan2.getLoanAmount()));
    }

//    @Override
//    public void Avg(){
//        System.out.println(list.stream().average((Loan->(Loan.getLoanAmount())));
//    }
}




