import java.util.List;

public class SampleOfflineData {

    /*
    5.12
    */

    public static void randomSampling(int k, List<Integer> A) {
    	Random gen = new Random();
        for (int i = 0; i < k; ++i) {
          // Generate a random int in [i, A.size() - 1].
          Collections.swap(A, i, i + gen.nextInt(A.size() - i));
        }
      }
}