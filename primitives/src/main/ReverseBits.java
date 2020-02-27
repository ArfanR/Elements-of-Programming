public class ReverseBits {

    /*
    4.3
    */

	public static long swapBits(long x, int i, int j) {
        if (((x >>> i) & 1) != ((x >>> j) & 1)) {
            long bitMask = (1 << i) | (1 << j);
            x ^= bitMask;
        }
        return x;
    }
	
	public static long reverseBits(long x) {
		int i = 0, j = 31;
        for (int k = 0; k <= 16; k++) {
            x = (int) swapBits(x, i++, j--);
        }
        return x;
	}
}