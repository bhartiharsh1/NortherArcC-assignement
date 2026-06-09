package Module2.day1;
import java.util.HashSet;
import java.util.Set;

public class TreeSetMain {
    public static void main(String[] args) {
        Set<Integer>  S =new HashSet<>();
        S.add(1);
        S.add(2);
        S.add(3);
        S.add(4);
        S.add(5);
        System.out.println("Removing" + S.remove(3));
        System.out.println("Removing" + S.remove(1));
        System.out.println("Removing" + S.remove(2));

    }
}
