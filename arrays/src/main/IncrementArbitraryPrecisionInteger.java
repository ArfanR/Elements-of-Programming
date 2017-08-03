import java.util.*;

public class IncrementArbitraryPrecisionInteger {

    /*
    5.2
    */

    public static List<Integer> incrementInteger(List<Integer> result) {
    	List<Integer> A = new ArrayList<Integer>(result);
        int n = A.size()-1;
        A.set(n, A.get(n)+1);

        for (int i = n; i > 0 && A.get(i) == 10; --i) {
            A.set(i, 0);
            A.set(i-1, A.get(i-1) + 1);
        }
        // need additional  one at beginning
        if (A.get(0) == 10) {
            A.set(0, 0);
            A.add(0, 1);
        }
        // remove  trailing zeros 
        if (n > 0) {
            while (A.get(0) == 0) {
                A.remove(0);
            }
        }
        return A;
    }

}

