public class ComputeParity {

    /*
    4.1
    */

	public static short parity1(long x) {
		short result = 0;
		while (x != 0) {
			result ^= (x & 1);
			x >>>= 1;
		}
		return result;
	}
	
	public static short parity2(long x) {
		short result = 0;
		while (x != 0) {
			result ^= 1;
			x &= (x - 1);
		}
		return result;
	}
	
    public static short parity3(long x) {
        x ^= x >>> 32;
        x ^= x >>> 16;
        x ^= x >>> 8;
        x ^= x >>> 4;
        x ^= x >>> 2;
        x ^= x >>> 1;
        return (short)(x & 0x1);
    }
}