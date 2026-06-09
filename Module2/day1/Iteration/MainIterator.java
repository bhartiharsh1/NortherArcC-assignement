package Module2.day1.Iteration;

import java.util.Iterator;

public class MainIterator {
    public static void main(String[] args) {
        Myrange range1 = new Myrange(10, 20);
        Iterator<Integer> itr = range1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
