package Module1.WeeklyAssign.Inheritance;
public class MainCA {

    public static void main(String[] args) {

        CollectionAgent a1 = new FieldAgent();
        CollectionAgent a2 = new TeleAgent();

        a1.contactBorrower();
        a2.contactBorrower();

        a1.updateRecoveryLog();
    }
}
