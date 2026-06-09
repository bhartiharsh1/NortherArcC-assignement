package Module2.day1.Iteration;

import java.util.Iterator;

public class Myrange implements Iterator<Integer>, Iterable<Integer> {
    private int start;
    private int end;

    public Myrange(int start, int end) {
        this.end = end;
        this.start = start;
    }

    @Override
    public boolean hasNext() {
        return start <= end;
    }

    @Override
    public Integer next() {
        return start++;
    }

    @Override
    public Iterator<Integer> iterator() {
        return this;
    }
}
