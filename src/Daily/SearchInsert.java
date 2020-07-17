package Daily;

/**
 * @author grady
 * @date 2020 20-7-17 下午5:01
 */
public class SearchInsert {
    public static void main(String[] args) {
        SearchInsert searchInsert = new SearchInsert();
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert.solution(nums, 7));
    }

    /**
     * 有序数组，那么就可以用二分法查找，用二分法不断逼近第一个大于等于target的下标
     * @param nums
     * @param target
     * @return
     */
    private int solution(int[] nums,int target){
        int n = nums.length;
        int left = 0,right = n-1,ans = n;
        while (left <= right){
            int mid = ((right - left)>>1) + left;
            if (target <= nums[mid]){
                ans = mid;
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
