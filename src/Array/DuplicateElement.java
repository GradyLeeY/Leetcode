package Array;

import java.util.*;

/**
 * @Author Grady
 * @Date 2020/5/18 12:11
 * @Version 1.0
 */
public class DuplicateElement {

    public static void main(String[] args) {
        int[] nums = {1,1,3,4};
        System.out.println(conDuplicate(nums));
    }

    //1先排序再查找
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
    //2哈希表
    private static boolean conDuplicate(int[] nums){
        Set<Integer> integers = new HashSet<>(nums.length);
        for (int x:nums
             ) {
            if (integers.contains(x)) return true;
            integers.add(x);
        }
        return false;
    }
}
