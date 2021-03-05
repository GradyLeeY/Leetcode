package Daily;

/**
 * @author quan.liu
 * @version 1.0
 * @ClassName MaxSubArray
 * @Description 最大子序和
 * @date 2021/3/5 17:04
 **/
public class MaxSubArray {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaxSubArray maxSubArray = new MaxSubArray();
        System.out.println(maxSubArray.solution(nums));
    }
    public int solution(int[] nums){
        int pre = 0,maxAns = nums[0];
        for (int x:nums
             ) {
            pre = Math.max(pre+x,x);
            maxAns = Math.max(maxAns,pre);
        }
        return maxAns;
    }
}
