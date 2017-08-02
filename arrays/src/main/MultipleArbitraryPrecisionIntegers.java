import java.util.*;

public class MultipleArbitraryPrecisionIntegers {

    /*
    6.3
    */

    public static List<Integer> multiply(List<Integer> a, List<Integer> b) {
        final int sign = a.get(0) < 0 || b.get(0) < 0 ? -1 : 1;
        a.set(0, Math.abs(a.get(0)));
        b.set(0, Math.abs(b.get(0)));

        List<Integer> result = new ArrayList<Integer>(Collections.nCopies(a.size() + b.size(), 0));
        // use grade school multiplication 
        // start from back of the array 
        for (int i = a.size()-1; i >= 0; i--) {
            for (int j = b.size()-1; j >= 0; j--) {
                result.set(i+j+1, result.get(i+j+1) + a.get(i) * b.get(j));
                result.set(i+j, result.get(i+j) + result.get(i+j+1)/10);
                result.set(i+j+1, result.get(i+j+1) % 10);
            }
        }

        // remove leading zeroes
        int firstNotZero = 0;
        while (firstNotZero < result.size() && result.get(firstNotZero) == 0) {
            firstNotZero++;
        }
        result = result.subList(firstNotZero, result.size());

        if (result.isEmpty()) {
            return Arrays.asList(0);
        }
        result.set(0, result.get(0) * sign);
        
        return result;
    }
    
}