import java.util.*;

public class EnumeratePrimes {

    /*
    5.8
    */

    public static List<Integer> enumeratePrimes(int n) {
    	List<Integer> primes = new ArrayList<>();
    	// isPrime.get(p) represents if p is prime or not. Initially, set each
        // to true, excepting 0 and 1. Then use sieving to eliminate nonprimes.
    	List<Boolean> isPrime = new ArrayList<>(Collections.nCopies(n + 1, true));
        isPrime.set(0, false);
        isPrime.set(1, false);
        for (int p = 2; p <= n; ++p) {
        	if (isPrime.get(p)) {
        		primes.add(p);
        		// Sieve p's multiples.
        		for (int i = p; i <= n; i += p) {
        			isPrime.set(i, false);
        		}
        	}
        }
        return primes;
      }
}