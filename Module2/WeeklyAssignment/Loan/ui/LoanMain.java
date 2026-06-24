/*
 * Loan Management System - UI
 * Pattern: Interface Reference = Implementation Object
 */
package Module2.WeeklyAssignment.Loan.ui;

import Module2.WeeklyAssignment.Loan.Entity.Loan;
import Module2.WeeklyAssignment.Loan.dao.LoanDao;
import Module2.WeeklyAssignment.Loan.dao.LoanImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class LoanMain {

    private static final Scanner sc = new Scanner(System.in);
    private static final LoanDao loanDao = new LoanImpl();

    public static void main(String[] args) throws SQLException {

        do {
            System.out.println("\n===== LOAN MANAGEMENT MENU =====");
            System.out.println("--- INSERT ---");
            System.out.println("1.  Add Loan");

            System.out.println("--- SELECT ---");
            System.out.println("2.  Find By Id");
            System.out.println("3.  Find All Loans");
            System.out.println("4.  Find By Status");
            System.out.println("5.  Find By Type");
            System.out.println("6.  Find By Amount Greater Than");
            System.out.println("7.  Find By Interest Less Than");
            System.out.println("8.  Find By Type And Status");

            System.out.println("--- SORT ---");
            System.out.println("9.  Sort By Amount (ASC)");
            System.out.println("10. Sort By Amount (DESC)");
            System.out.println("11. Sort By Interest");
            System.out.println("12. Sort By Amount And Interest");

            System.out.println("--- UPDATE ---");
            System.out.println("13. Update Interest By Id");
            System.out.println("14. Update Loan Status");
            System.out.println("15. Update Interest By Type");

            System.out.println("--- DELETE ---");
            System.out.println("16. Delete By Id");
            System.out.println("17. Delete By Status");
            System.out.println("18. Delete All");
            System.out.println("--- EXISTS ---");
            System.out.println("19. Exists By Id");

            System.out.println("--- AGGREGATE ---");
            System.out.println("20. Count All Loans");
            System.out.println("21. Count By Status");
            System.out.println("22. Max Loan Amount");
            System.out.println("23. Min Loan Amount");
            System.out.println("24. Average Loan Amount");
            System.out.println("25. Total Loan Amount");

            System.out.println("--- GROUP BY ---");
            System.out.println("26. Group By Status");
            System.out.println("27. Group By Type");
            System.out.println("--- HAVING ---");
            System.out.println("28. Group By Type Having Count Greater Than");
            System.out.println("--- LIMIT ---");
            System.out.println("29. Top N Loans (by Amount)");
            System.out.println("0.  Exit");
            System.out.print("\nEnter option: ");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {

                case 1 -> addLoan();
                case 2 -> findById();
                case 3 -> {
                    System.out.println("\n--- All Loans ---");
                    loanDao.findAll().forEach(System.out::println);
                }
                case 4 -> findByStatus();
                case 5 -> findByType();
                case 6 -> findByAmount();
                case 7 -> findByInterest();
                case 8 -> findByTypeAndStatus();
                case 9 -> {
                    System.out.println("\n--- Sorted by Amount (ASC) ---");
                    loanDao.sortByAmount().forEach(System.out::println);
                }
                case 10 -> {
                    System.out.println("\n--- Sorted by Amount (DESC) ---");
                    loanDao.sortByAmountDesc().forEach(System.out::println);
                }
                case 11 -> {
                    System.out.println("\n--- Sorted by Interest ---");
                    loanDao.sortByInterest().forEach(System.out::println);
                }
                case 12 -> {
                    System.out.println("\n--- Sorted by Amount & Interest ---");
                    loanDao.sortByAmountAndInterest().forEach(System.out::println);
                }
                case 13 -> updateInterestById();
                case 14 -> updateLoanStatus();
                case 15 -> updateInterestByType();
                case 16 -> deleteById();
                case 17 -> deleteByStatus();
                case 18 -> {
                    System.out.print("Are you sure you want to delete ALL loans? (yes/no): ");
                    String confirm = sc.nextLine();
                    if (confirm.equalsIgnoreCase("yes")) {
                        loanDao.deleteAll();
                        System.out.println("All loans deleted.");
                    } else {
                        System.out.println("Cancelled.");
                    }
                }
                case 19 -> existsById();
                case 20 -> System.out.println("Total Loans: " + loanDao.countLoans());
                case 21 -> countByStatus();
                case 22 -> System.out.println("Max Loan Amount: " + loanDao.getMaxLoanAmount());
           case 28 -> groupByTypeHaving();
                case 29 -> topNLoans();
                case 0 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }

        } while (true);
    }

    // ========================= HELPER METHODS ================================

    static void addLoan() throws SQLException {
        System.out.print("Loan Type (e.g. Home Loan, Vehicle Loan): ");
        String type = sc.nextLine();

        System.out.print("Loan Amount: ");
        int amount = sc.nextInt();
        sc.nextLine();

        System.out.print("Loan Status (e.g. Pending, Accepted, Rejected): ");
        String status = sc.nextLine();

        System.out.print("Interest Rate (%): ");
        double interest = sc.nextDouble();

        System.out.print("Tenure (months): ");
        int tenure = sc.nextInt();
        sc.nextLine();

        Loan loan = new Loan(type, amount, status, interest, tenure);
        int rows = loanDao.save(loan);
        System.out.println("Rows inserted: " + rows);
    }

    static void findById() throws SQLException {
        System.out.print("Enter Loan ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        Loan loan = loanDao.findById(id);
        if (loan != null) {
            System.out.println(loan);
        } else {
            System.out.println("No loan found with ID: " + id);
        }
    }

    static void findByStatus() throws SQLException {
        System.out.print("Enter Status: ");
        String status = sc.nextLine();
        System.out.println("\n--- Loans with status: " + status + " ---");
        loanDao.findByStatus(status).forEach(System.out::println);
    }

    static void findByType() throws SQLException {
        System.out.print("Enter Type: ");
        String type = sc.nextLine();
        System.out.println("\n--- Loans of type: " + type + " ---");
        loanDao.findByType(type).forEach(System.out::println);
    }

    static void findByAmount() throws SQLException {
        System.out.print("Enter minimum amount: ");
        int amount = sc.nextInt();
        sc.nextLine();
        System.out.println("\n--- Loans with amount > " + amount + " ---");
        loanDao.findByAmountGreaterThan(amount).forEach(System.out::println);
    }

    static void findByInterest() throws SQLException {
        System.out.print("Enter maximum interest rate: ");
        double interest = sc.nextDouble();
        sc.nextLine();
        System.out.println("\n--- Loans with interest < " + interest + "% ---");
        loanDao.findByInterestLessThan(interest).forEach(System.out::println);
    }

    static void findByTypeAndStatus() throws SQLException {
        System.out.print("Enter Type: ");
        String type = sc.nextLine();
        System.out.print("Enter Status: ");
        String status = sc.nextLine();
        System.out.println("\n--- Loans: type=" + type + ", status=" + status + " ---");
        loanDao.findByTypeAndStatus(type, status).forEach(System.out::println);
    }

    static void updateInterestById() throws SQLException {
        System.out.print("Enter Loan ID: ");
        int id = sc.nextInt();
        System.out.print("Enter new Interest Rate (%): ");
        double interest = sc.nextDouble();
        sc.nextLine();
        loanDao.updateInterestById(id, interest);
    }

    static void updateLoanStatus() throws SQLException {
        System.out.print("Enter Loan ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new Status: ");
        String status = sc.nextLine();
        loanDao.updateLoanStatus(id, status);
    }

    static void updateInterestByType() throws SQLException {
        System.out.print("Enter Loan Type: ");
        String type = sc.nextLine();
        System.out.print("Enter new Interest Rate (%): ");
        double interest = sc.nextDouble();
        sc.nextLine();
        loanDao.updateInterestByType(type, interest);
    }

    static void deleteById() throws SQLException {
        System.out.print("Enter Loan ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();
        loanDao.deleteById(id);
    }

    static void deleteByStatus() throws SQLException {
        System.out.print("Enter Status to delete: ");
        String status = sc.nextLine();
        loanDao.deleteByStatus(status);
    }

    static void existsById() throws SQLException {
        System.out.print("Enter Loan ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        boolean exists = loanDao.existsById(id);
        System.out.println("Loan ID " + id + " exists: " + exists);
    }

    static void countByStatus() throws SQLException {
        System.out.print("Enter Status: ");
        String status = sc.nextLine();
        System.out.println("Count of '" + status + "' loans: " + loanDao.countByStatus(status));
    }

    static void groupByTypeHaving() throws SQLException {
        System.out.print("Enter minimum count threshold: ");
        int count = sc.nextInt();
        sc.nextLine();
        System.out.println("\n--- Types having count > " + count + " ---");
        loanDao.groupByTypeHavingCountGreaterThan(count);
    }

    static void topNLoans() throws SQLException {
        System.out.print("Enter N (top N loans by amount): ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("\n--- Top " + n + " Loans ---");
        loanDao.topNLoans(n).forEach(System.out::println);
    }
}