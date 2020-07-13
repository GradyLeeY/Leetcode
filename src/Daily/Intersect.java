package Daily;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**给定两个数组，编写一个函数来计算它们的交集。
 * @author grady
 * @date 2020 20-7-13 下午4:53
 */
public class Intersect {

    public static void main(String[] args) {
        Intersect intersect = new Intersect();
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        int[] solution = intersect.solution2(num1, num2);
        System.out.println(Arrays.toString(solution));
    }

    /**
     * 由于每个数字可能出现多次，所以要用hash表记录每个数字出现的次数，对于一个数字，其在交集中出现的最小次数应该等于这个数字在两个数组中出现的次数的最小值
     * 首先遍历第一个数组，将这个数组出现的数字和出现的次数记录下来，再遍历第二个数组对于这个数组出现的每一个数字，如果在map中存在，那么将其存入res中，并且
     * 减少其出现的次数
     * @param nums1
     * @param nums2
     * @return
     */
    private int[] solution(int[] nums1,int[] nums2){
        if (nums1.length > nums2.length){
            return solution(nums2,nums1);
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int num:nums1
             ) {
            int count = map.getOrDefault(num,0)+1;
            map.put(num,count);
        }

        int[] res = new int[nums1.length];
        int index = 0;
        for (int num:nums2
             ) {
            int count = map.getOrDefault(num,0);

            if (count > 0){
                res[index++] = num;
                count --;
                if (count > 0){
                    map.put(num,count);
                }else {
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(res,0,index);
    }

    /**
     * 首先对两个数组进行排序，初始时两个数组的指针都指向头部，每次比较两个指针指向两个数组的元素，如果不相等，则较小数字的指针向右移一位
     * 当至少有一个数组的指针超出数组长度时，跳出循环，遍历结束
     * @param nums1
     * @param nums2
     * @return
     */
    private int[] solution2(int[] nums1,int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index1= 0,index2 = 0,index = 0;
        int length1 = nums1.length,lenght2 = nums2.length;
        int []res = new int[Math.min(lenght2,length1)];
        while (index1 < length1 && index2 < lenght2){
            if (nums1[index1] < nums2[index2]){
                index1++;
            }else if (nums1[index1] > nums2[index2]){
                index2++;
            }else {
                res[index] = nums1[index1];
                index++;
                index2++;
                index1++;
            }
        }
        return Arrays.copyOfRange(res,0,index);
    }
}
