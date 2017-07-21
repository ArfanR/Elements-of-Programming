import java.util.*;
import java.lang.*;

public class DutchNationalFlag {

    /*
    6.1
    */

    public static void dutchNationalFlag(int p, List<Integer> A) {
        if (p < 0 || p >= A.size()) {
            System.out.println("Invalid index");
        }

        int pivot = A.get(p);
        int smaller = 0;
        int equal = 0;
        int larger = A.size()-1;

        while (equal < larger) {
            if (A.get(equal) < pivot) {
                Collections.swap(A, A.get(equal++), A.get(smaller++));
            }
            else if (A.get(equal) == pivot) {
                equal++;
            }
            else if (A.get(equal > pivot) {
                Collections.swap(A, A.get(equal), A.get(larger--));
            }
        }
    }

    // Variant: reorder so all keys with same value are together
    public static void dutchNationalFlag2(int p, List<Integer> A) {
        if (p < 0 || p >= A.size()) {
            System.out.println("Invalid index");
        }
        int pivot = A.get(p);
        int equal = 0;
        for (int i = 0; i < A.size(); i++) {
            if (pivot == A.get(i)) {
                Collections.swap(A, A.get(equal++), A.get(i));
            }
        }
    }

    // Variant: reorder keys with boolean values so the false appears first
    public static void dutchNationalFlag3(int p, List<Boolean> A) {
        if (p < 0 || p >= A.size()) {
            System.out.println("Invalid index");
        }
        int falsePos = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == false) {
                Collections.swap(A, A.get(falsePos++), A.get(i));
            }
        }
    }

}

