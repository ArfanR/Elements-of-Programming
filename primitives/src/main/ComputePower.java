public class ComputePower {

    /*
    4.7
    */

    public static double power(double x, int y) {
        double result = 1.0;
        long power = y;
        if (y < 0) {
            power = -power;
            x = 1.0 / x;
        }
        while (power != 0) {
            if ((power & 1) == 1) {
                result *= x;
            }
            x *= x;
            power >>>= 1;
        }
        return result;
    }
}