package Daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author grady
 * @date 20-6-12 下午4:28
 */
public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(solution(nums));
    }

    private static List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        if (len < 3 || nums == null) {
            return ans;
        }
        //排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                break;
            }
            //去重
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int L = i + 1;
            int R = len - 1;
            while (L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L < R && nums[L] == nums[L+1]) L++;
                    while (L < R && nums[R] == nums[R-1]) R--;
                    L ++;
                    R --;
                }
                else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }
        return ans;
    }
}
