package Module2.WeeklyAssignment.Loan.dao;

import Module2.WeeklyAssignment.Loan.Entity.Loan;
import Module2.day5.Connection.DBManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/*
 * Loan DAO Implementation using PostgreSQL (JDBC)
 * Table DDL:
 *   CREATE TABLE IF NOT EXISTS loan (
 *       loanid   SERIAL PRIMARY KEY,
 *       loanType   VARCHAR(100),
 *       loanAmount INT,
 *       loanStatus VARCHAR(50),
 *       interest   DOUBLE PRECISION,
 *       tenure     INT
 *   );
 */
public class LoanImpl implements LoanDao {

    // ── Constructor: auto-creates the table if it doesn't exist ──────────────
    public LoanImpl() {
        String sql = "CREATE TABLE IF NOT EXISTS loan (" +
                "loanid     SERIAL PRIMARY KEY, " +
                "loanType   VARCHAR(100), " +
                "loanAmount INT, " +
                "loanStatus VARCHAR(50), " +
                "interest   DOUBLE PRECISION, " +
                "tenure     INT)";
        try {
            Connection con = DBManager.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            DBManager.closeConnection(con);
        } catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
        }
    }

    // ── Helper: map a ResultSet row to a Loan object ─────────────────────────
    private Loan mapToLoan(ResultSet rs) throws SQLException {
        return new Loan(
                rs.getInt("loanid"),
                rs.getString("loanType"),
                rs.getInt("loanAmount"),
                rs.getString("loanStatus"),
                rs.getDouble("interest"),
                rs.getInt("tenure")
        );
    }

    // ========================= INSERT ========================================

    @Override
    public int save(Loan loan) throws SQLException {
        Connection con = DBManager.getConnection();
        String sql = "INSERT INTO loan(loanType, loanAmount, loanStatus, interest, tenure) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, loan.getLoanType());
        stmt.setInt(2, loan.getLoanAmount());
        stmt.setString(3, loan.getLoanStatus());
        stmt.setDouble(4, loan.getInterest());
        stmt.setInt(5, loan.getTenure());
        int rows = stmt.executeUpdate();
        DBManager.closeConnection(con);
        return rows;
    }

    // ========================= SELECT ========================================

    @Override
    public Loan findById(int loanId) throws SQLException {
        Connection con = DBManager.getConnection();
        String sql = "SELECT * FROM loan WHERE loanid = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, loanId);                  // FIX: bind loanId parameter
        ResultSet rs = stmt.executeQuery();
        Loan loan = null;
        if (rs.next()) {
            loan = mapToLoan(rs);
        }
        DBManager.closeConnection(con);
        return loan;
    }

    @Override
    public Collection<Loan> findAll() throws SQLException {
        Connection con = DBManager.getConnection();
        List<Loan> loansList = new LinkedList<>();
        String sql = "SELECT * FROM loan";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            loansList.add(mapToLoan(rs));
        }
        DBManager.closeConnection(con);
        return loansList;
    }

    @Override
    public Collection<Loan> findByStatus(String status) throws SQLException {
        Connection con = DBManager.getConnection();
        List<Loan> loansList = new LinkedList<>();
        String sql = "SELECT * FROM loan WHERE loanStatus = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, status);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            loansList.add(mapToLoan(rs));
        }
        DBManager.closeConnection(con);
        return loansList;
    }

    @Override
    public Collection<Loan> findByType(String type) throws SQLException {
        Connection con = DBManager.getConnection();
        List<Loan> loansList = new LinkedList<>();
        String sql = "SELECT * FROM loan WHERE loanType = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, type);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            loansList.add(mapToLoan(rs));
        }
        DBManager.closeConnection(con);
        return loansList;
    }

    @Override
    public Collection<Loan> findByAmountGreaterThan(int amount) throws SQLException {
        Connection con = DBManager.getConnection();
        List<Loan> loansList = new LinkedList<>();
        String sql = "SELECT * FROM loan WHERE loanAmount > ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, amount);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            loansList.add(mapToLoan(rs));
        }
        DBManager.closeConnection(con);
        return loansList;
    }

    @Override
    public Collection<Loan> findByInterestLessThan(double interest) throws SQLException {
        Connection con = DBManager.getConnection();
        List<Loan> loansList = new LinkedList<>();
        String sql = "SELECT * FROM loan WHERE interest < ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setDouble(1, interest);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            loansList.add(mapToLoan(rs));
        }
        DBManager.closeConnection(con);
        return loansList;
    }

    @Override
    public Collection<Loan> findByTypeAndStatus(String type, String status) throws SQLException {
        Connection con = DBManager.getConnection();
        List<Loan> loansList = new LinkedList<>();
        String sql = "SELECT * FROM loan WHERE loanType = ? AND loanStatus = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, type);
        stmt.setString(2, status);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            loansList.add(mapToLoan(rs));
        }
        DBManager.closeConnection(con);
        return loansList;
    }

    // ========================= SORTING =======================================

    @Override
    public Collection<Loan> sortByAmount() throws SQLException {
        Connection con = DBManager.getConnection();
        List<Loan> loansList = new LinkedList<>();
        String sql = "SELECT * FROM loan ORDER BY loanAmount ASC";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            loansList.add(mapToLoan(rs));
        }
        DBManager.closeConnection(con);
        return loansList;
    }

    @Override
    public Collection<Loan> sortByAmountDesc() throws SQLException {
        Connection con = DBManager.getConnection();
        List<Loan> loansList = new LinkedList<>();
        String sql = "SELECT * FROM loan ORDER BY loanAmount DESC";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            loansList.add(mapToLoan(rs));
        }
        DBManager.closeConnection(con);
        return loansList;
    }

    @Override
    public Collection<Loan> sortByInterest() throws SQLException {
        Connection con = DBManager.getConnection();
        List<Loan> loansList = new LinkedList<>();
        String sql = "SELECT * FROM loan ORDER BY interest ASC";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            loansList.add(mapToLoan(rs));
        }
        DBManager.closeConnection(con);
        return loansList;
    }

    @Override
    public Collection<Loan> sortByAmountAndInterest() throws SQLException {
        Connection con = DBManager.getConnection();
        List<Loan> loansList = new LinkedList<>();
        String sql = "SELECT * FROM loan ORDER BY loanAmount ASC, interest ASC";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            loansList.add(mapToLoan(rs));
        }
        DBManager.closeConnection(con);
        return loansList;
    }

    // ========================= UPDATE ========================================

    @Override
    public void updateInterestById(int loanId, double interest) throws SQLException {
        Connection con = DBManager.getConnection();
        String sql = "UPDATE loan SET interest = ? WHERE loanid = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setDouble(1, interest);
        stmt.setInt(2, loanId);
        int rows = stmt.executeUpdate();
        System.out.println("Rows updated: " + rows);
        DBManager.closeConnection(con);
    }

    @Override
    public void updateLoanStatus(int loanId, String status) throws SQLException {
        Connection con = DBManager.getConnection();
        String sql = "UPDATE loan SET loanStatus = ? WHERE loanid = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, status);
        stmt.setInt(2, loanId);
        int rows = stmt.executeUpdate();
        System.out.println("Rows updated: " + rows);
        DBManager.closeConnection(con);
    }

    @Override
    public void updateInterestByType(String type, double interest) throws SQLException {
        Connection con = DBManager.getConnection();
        String sql = "UPDATE loan SET interest = ? WHERE loanType = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setDouble(1, interest);
        stmt.setString(2, type);
        int rows = stmt.executeUpdate();
        System.out.println("Rows updated: " + rows);
        DBManager.closeConnection(con);
    }

    // ========================= DELETE ========================================

    @Override
    public void deleteById(int loanId) throws SQLException {
        Connection con = DBManager.getConnection();
        String sql = "DELETE FROM loan WHERE loanid = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, loanId);
        int rows = stmt.executeUpdate();
        System.out.println("Rows deleted: " + rows);
        DBManager.closeConnection(con);
    }

    @Override
    public void deleteByStatus(String status) throws SQLException {
        Connection con = DBManager.getConnection();
        String sql = "DELETE FROM loan WHERE loanStatus = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, status);
        int rows = stmt.executeUpdate();
        System.out.println("Rows deleted: " + rows);
        DBManager.closeConnection(con);
    }

    @Override
    public void deleteAll() throws SQLException {
        Connection con = DBManager.getConnection();
        String sql = "DELETE FROM loan";
        PreparedStatement stmt = con.prepareStatement(sql);
        int rows = stmt.executeUpdate();
        System.out.println("All rows deleted: " + rows);
        DBManager.closeConnection(con);
    }

    // ========================= EXISTS ========================================

    @Override
    public boolean existsById(int loanId) throws SQLException {
        Connection con = DBManager.getConnection();
        String sql = "SELECT 1 FROM loan WHERE loanid = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, loanId);              // FIX: bind loanId parameter
        ResultSet rs = stmt.executeQuery();
        boolean exists = rs.next();          // FIX: read RS before closing connection
        DBManager.closeConnection(con);
        return exists;
    }

    // ========================= AGGREGATE =====================================

    @Override
    public int countLoans() throws SQLException {
        Connection con = DBManager.getConnection();
        String sql = "SELECT COUNT(*) FROM loan";   // FIX: use COUNT(*) instead of SELECT *
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        int cnt = 0;
        if (rs.next()) {
            cnt = rs.getInt(1);             // FIX: read RS before closing connection
        }
        DBManager.closeConnection(con);
        return cnt;
    }

    @Override
    public int countByStatus(String status) throws SQLException {
        Connection con = DBManager.getConnection();
        String sql = "SELECT COUNT(*) FROM loan WHERE loanStatus = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, status);
        ResultSet rs = stmt.executeQuery();
        int cnt = 0;
        if (rs.next()) {
            cnt = rs.getInt(1);
        }
        DBManager.closeConnection(con);
        return cnt;
    }

    @Override
    public int getMaxLoanAmount() throws SQLException {
        Connection con = DBManager.getConnection();
        String sql = "SELECT MAX(loanAmount) FROM loan";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        int maxAmt = 0;
        if (rs.next()) {
            maxAmt = rs.getInt(1);
        }
        DBManager.closeConnection(con);
        return maxAmt;
    }

    @Override
    public int getMinLoanAmount() throws SQLException {
        Connection con = DBManager.getConnection();
        String sql = "SELECT MIN(loanAmount) FROM loan";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        int minAmt = 0;
        if (rs.next()) {
            minAmt = rs.getInt(1);
        }
        DBManager.closeConnection(con);
        return minAmt;
    }

    @Override
    public double getAverageLoanAmount() throws SQLException {
        Connection con = DBManager.getConnection();
        String sql = "SELECT AVG(loanAmount) FROM loan";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        double avgAmt = 0;
        if (rs.next()) {
            avgAmt = rs.getDouble(1);       // FIX: use getDouble for AVG result
        }
        DBManager.closeConnection(con);
        return avgAmt;
    }

    @Override
    public int getTotalLoanAmount() throws SQLException {
        Connection con = DBManager.getConnection();
        String sql = "SELECT SUM(loanAmount) FROM loan";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        int totalAmt = 0;
        if (rs.next()) {
            totalAmt = rs.getInt(1);
        }
        DBManager.closeConnection(con);
        return totalAmt;
    }

    // ========================= GROUP BY ======================================

    @Override
    public void groupByStatus() throws SQLException {
        Connection con = DBManager.getConnection();
        String sql = "SELECT loanStatus, COUNT(*) AS count FROM loan GROUP BY loanStatus";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        System.out.println("Status\t\t\tCount");
        System.out.println("--------------------------------");
        while (rs.next()) {
            System.out.println(rs.getString(1) + "\t\t\t" + rs.getInt(2));
        }
        DBManager.closeConnection(con);
    }

    @Override
    public void groupByType() throws SQLException {
        Connection con = DBManager.getConnection();
        String sql = "SELECT loanType, COUNT(*) AS count FROM loan GROUP BY loanType";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        System.out.println("Type\t\t\tCount");
        System.out.println("--------------------------------");
        while (rs.next()) {
            System.out.println(rs.getString(1) + "\t\t\t" + rs.getInt(2));
        }
        DBManager.closeConnection(con);
    }

    // ========================= HAVING ========================================

    @Override
    public void groupByTypeHavingCountGreaterThan(int count) throws SQLException {
        Connection con = DBManager.getConnection();
        String sql = "SELECT loanType, COUNT(*) AS count FROM loan GROUP BY loanType HAVING COUNT(*) > ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, count);
        ResultSet rs = stmt.executeQuery();
        System.out.println("Type\t\t\tCount");
        System.out.println("--------------------------------");
        while (rs.next()) {
            System.out.println(rs.getString(1) + "\t\t\t" + rs.getInt(2));
        }
        DBManager.closeConnection(con);
    }

    // ========================= LIMIT =========================================

    @Override
    public Collection<Loan> topNLoans(int n) throws SQLException {
        Connection con = DBManager.getConnection();
        List<Loan> loanList = new LinkedList<>();
        String sql = "SELECT * FROM loan ORDER BY loanAmount DESC LIMIT ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, n);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            loanList.add(mapToLoan(rs));
        }
        DBManager.closeConnection(con);
        return loanList;
    }
}