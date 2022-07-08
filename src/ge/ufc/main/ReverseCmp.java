package ge.ufc.main;

import java.util.Comparator;

public class ReverseCmp implements Comparator<Triangle> {
    @Override
    public int compare(Triangle t1, Triangle t2) {
        return - Integer.compare(t1.getLength(), t2.getLength());
    }
}
