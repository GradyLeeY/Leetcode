package Array;

import java.util.HashMap;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现了三次。找出那个只出现了一次的元素。
 */
public class SingleNumber2 {

    public static void main(String[] args) {
        int[] nums = {2,2,3,2,3,3,8};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int num:nums
             ) {
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        }
        for (int k:hashMap.keySet()
             ) {
            if (hashMap.get(k) == 1){
                return k;
            }
        }
        return -1;
    }
}
