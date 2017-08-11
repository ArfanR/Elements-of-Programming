public class ReverseDigits {

    /*
    4.8
    */

    public static long reverse(int x) {
    	long result = 0;
        long xRemaining = Math.abs(x);
        while (xRemaining != 0) {
          result = result * 10 + xRemaining % 10;
          xRemaining /= 10;
        }
        return x < 0 ? -result : result;
    }
}