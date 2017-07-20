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

        while (equal <= larger) {
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

}