package Daily;

import java.util.ArrayList;
import java.util.List;

/**
 * @author grady
 * @date 20-6-1 上午11:47
 */
public class MaxCandies {

    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies, extraCandies));

    }
    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        int n = candies.length;
        List<Boolean> list = new ArrayList<>();
        int maxCandies = 0;
        for (int i = 0; i < n; i++) {
            if (candies[i] > maxCandies){
                maxCandies = candies[i];
            }
        }
        for (int i = 0; i < n; i++) {
            list.add(candies[i] + extraCandies >= maxCandies);
        }
        return list;
    }
}
