package Array;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
 * 注意：你不能在买入股票前卖出股票。
 * @author grady
 * @date 20-6-4 下午5:20
 */
public class MaxProfit {

    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(solution(nums));
    }
    private static int solution2(int[] nums){
        int maxProfit = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]<nums[i+1]){
                maxProfit+=nums[i+1]-nums[i];
            }
        }
        return maxProfit;
    }
    private static int solution(int[] nums){
        int maxProfit = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int profit = nums[j]-nums[i];
                if (profit>maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
