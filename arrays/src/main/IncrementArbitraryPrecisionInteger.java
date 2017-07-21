import java.util.List;

public class IncrementArbitraryPrecisionInteger {

    /*
    6.2
    */

    public static List<Integer> incrementInteger(List<Integer> A) {
        int n = A.size()-1;
        A.set(n, A.get(n)+1);

        for (int i = n; i > 0 && A.get(i) == 10; i--) {
            A.set(i, 0);
            A.set(i-1, A.get(i-1) + 1);
        }

        if (A.get(0) == 10) {
            A.set(0, 0);
            A.add(0, 1);
        }

        if (n > 0) {
            while (A.get(0) == 0) {
                A.remove(0);
            }
        }

        return A;
    }

    public static List<Integer> incrementInteger2(List<Integer> A) {
        int n = A.size()-1;
        int carry = 0;

        for (int i = n; i >= 0; i--) {
            if (carry + A.get(i) >= 10) {
                A.set(i, 0);
                carry = 1;
            }
            else {
                A.set(i, carry + A.get(i));
                break;
            }
        }

        if (A.get(0) == 0 && carry == 1) {
            A.set(0, 0);
            A.add(0, 1);
        }

        if (n > 0) {
            while (A.get(0) == 0) {
                A.remove(0);
            }
        }
    }
}

