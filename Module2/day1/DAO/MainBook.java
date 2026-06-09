package Module2.day1.DAO;

public class MainBook {

    public static void main(String[] args) {

        BookDao dao = new BookDaoImple();

        dao.save(new Book(1, "harsh", "bharti"));
        dao.save(new Book(2, "kalyan", "S"));
        dao.save(new Book(3, "Nikash", "K"));
        dao.save(new Book(4, "aporup", "P"));

        System.out.println( "All Books");
        for (Book b : dao.findAll()) {
            System.out.println(b);
        }

        System.out.println("Find By Id ");
        System.out.println(dao.findById(2));

        System.out.println("Find By Author ");
        for (Book b : dao.findByAuthor("Trivikram")) {
            System.out.println(b);
        }

        System.out.println(" Sort Asc");
        for (Book b : dao.sortByTitleAsc()) {
            System.out.println(b);
        }

        System.out.println("Sort Desc");
        for (Book b : dao.sortByTitleDesc()) {
            System.out.println(b);
        }

        dao.update(new Book(2, "harsh", "bharti"));

        System.out.println(" After Update");
        for (Book b : dao.findAll()) {
            System.out.println(b);
        }

        dao.deleteById(4);

        System.out.println(" After Delete");
        for (Book b : dao.findAll()) {
            System.out.println(b);
        }
    }
}

