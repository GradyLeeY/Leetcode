package Array;

import java.util.Arrays;

/**
 * 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {2,2,8,1,8};
        System.out.println(bynusSolution(nums));
    }
    //排序后循环取值
    public static int solutionSort(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i+=2) {
            if (nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
    //位运算
    public static int bynusSolution(int[] nums){
        int single = 0;
        for (int num:nums
             ) {
            single ^=num;
        }
        return single;
    }
}
