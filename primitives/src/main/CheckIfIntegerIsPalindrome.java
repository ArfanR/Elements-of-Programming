public class CheckIfIntegerIsPalindrome {

    /*
    4.9
    */

    public static boolean isPalindrome(int x) {
    	if (x < 0) {
    		return false;
    	}
    	final int numDigits = (int) (Math.floor(Math.log10(x) + 1));
    	int msdMask = (int) Math.pow(10, numDigits-1);
    	for (int i = 0; i < (numDigits / 2); i++) {
    		if (x % 10 != x / msdMask) {
    			return false;
    		}
    		x %= 10;
    		x /= 10;
    		msdMask /= 100;
    	}
    	return true;
    }
}