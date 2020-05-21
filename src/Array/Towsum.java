package Array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author grady
 * @date 20-5-21 下午7:54
 */
public class Towsum {

    public static void main(String[] args) {

    }

    /**
     * 暴力法,遍历数组中的每一个元素，如果找到target-x的目标值就返回下标
     * @param nums
     * @param target
     * @return
     */
    private static int[] solution(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    private static int[] solution2(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (map.containsKey(result)&&map.get(result) != i){
                return new int[]{i,map.get(result)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    private static int[] solution3(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (map.containsKey(result)){
                return new int[]{i,map.get(result)};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
