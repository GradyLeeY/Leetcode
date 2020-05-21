package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 */
public class Intersect {

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] ints = solution1(nums1, nums2);
        for (int i:ints
             ) {
            System.out.println(i);
        }
    }
    /**
     * 对数组nums1和nums2进行排序
     * 初始化指针i、j、k分别指向nums1、nums2以及新数组nums3
     * 如果nums1>nums2则j++
     * 如果nums1<nums2则i++
     * 如果相等则将元素拷贝到nums1[k]中,i++,j++,k++
     * 最后返回nums1的前k个元素
     * @param nums1
     * @param nums2
     * @return
     */
    private static int[] solution1(int[] nums1,int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i =0,j = 0,k = 0;
        while (i < nums1.length && j<nums2.length){
            if (nums1[i] < nums2[j]){
                i++;
            }else if (nums1[i]>nums2[j]){
                j++;
            }else {
                nums1[k] = nums1[i];
                k++;
                i++;
                ++j;
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }

    /**
     * 对较少的数组进行哈希映射
     * 先用hashmap来记录较大数组中存在的元素和次数
     * 然后遍历较小的数组，检查该数组在hashmap中是否存在，如果存在将元素拷贝到nums[k]中，同时减少hashmap中的相应计数
     * 返回num1中前k个元素
     * @param nums1
     * @param nums2
     * @return
     */
    private static int[] solution2(int[] nums1,int[] nums2){
        if (nums1.length<nums2.length){
            return solution2(nums2,nums1);
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int n: nums1
             ) {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int k = 0;
        for (int n:nums2
             ) {
            int current = map.getOrDefault(n,0);
            if (current>0){
                nums1[k] = n;
                k++;
                map.put(n,current-1);
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }
}
