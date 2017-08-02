import java.util.*;
import java.lang.*;

public class DutchNationalFlag {

    /*
    5.1
    */

    public static void dutchNationalFlag(int p, List<Integer> A) {
        if (p < 0 || p >= A.size()) {
            System.out.println("Invalid index");
        }
        /*
            keep separate groups for partitioning:
            bottom: (0, smaller)
            middle: (smaller, equal)
            unclassified: (equal, larger)
            top: (larger, A.size())
        */
        int pivot = A.get(p);
        int smaller = 0, equal = 0, larger = A.size();
        // iterate as long as there's an unclassified element
        while (equal < larger) {
            if (A.get(equal) < pivot) {
                Collections.swap(A, equal++, smaller++);
            }
            else if (A.get(equal) == pivot) {
                equal++;
            }
            else if (A.get(equal) > pivot) {
                Collections.swap(A, equal, --larger);
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
                Collections.swap(A, equal++, i);
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
                Collections.swap(A, falsePos++, i);
            }
        }
    }

}

