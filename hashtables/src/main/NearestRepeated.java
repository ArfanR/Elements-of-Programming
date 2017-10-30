import java.util.*;

public class NearestRepeated {

    /*
    12.6
    */

    public static int findNearest(List<String> paragraph) {
    	Map<String, Integer> wordToLatestIndex = new HashMap<>();
        int nearestRepeatedDistance = Integer.MAX_VALUE;
        for (int i = 0; i < paragraph.size(); ++i) {
          if (wordToLatestIndex.containsKey(paragraph.get(i))) {
            nearestRepeatedDistance = Math.min(nearestRepeatedDistance, i - wordToLatestIndex.get(paragraph.get(i)));
          }
          wordToLatestIndex.put(paragraph.get(i), i);
        }
        return nearestRepeatedDistance;
    }
}