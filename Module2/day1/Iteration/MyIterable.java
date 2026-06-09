package Module2.day1.Iteration;

import java.util.Iterator;

public class MyIterable implements Iterable<Integer> {
    public int start;
    public int end;

    public MyIterable(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Myrange(start, end);
    }
}
