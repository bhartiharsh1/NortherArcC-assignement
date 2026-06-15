package Module2.day3.Stream.UI;

import Module2.day3.Stream.Entity.Loan;
import Module2.day3.Stream.dao.LaoDaoImplementor;

public class MainStream {
    public static void main(String[] args) {

        LaoDaoImplementor list = new LaoDaoImplementor ();
        list.save(new Loan(1,10000,12,"Rejected",12,"Vehicle"));
        list.save(new Loan(2,15693,12,"Accepted",11,"Vehicle"));
        list.save(new Loan(3,234325,12,"Accepted",13,"EDUCATION"));
        list.save(new Loan(4,87254,12,"Rejected",12,"EDUCATION"));
        list.save(new Loan(5,10043,12,"Accepted",17,"Vehicle"));
        list.save(new Loan(6,22381,12,"Accepted",14,"EDUCATION"));
        list.save(new Loan(7,5023523,12,"Accepted",17,"Vehicle"));

//        System.out.println(list.findByLoanStatus("Rejected"));
        System.out.println(list.findByLoanType("Vehicle"));
        System.out.println(list.loanIncrease(2));
        list.maxLoan();
        list.minLoan();
//        list.Avg();

//        System.out.println();




    }
}
