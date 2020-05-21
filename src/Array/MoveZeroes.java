package Array;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {1,0,4,12,0};
        int[] solution = solution2(nums);
        for (int n:solution
             ) {
            System.out.println(n);
        }
    }

    /**
     * 参照快排的思想，将所有是以！=0为界限
     * 将所有小于0的放到右边，大于0的放到左边
     * @param nums
     * @return
     */
    public static int[] solution2(int[] nums){
        if (nums == null) return null;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j++] = temp;
            }
        }
        return nums;
    }

    /**
     * 两次遍历，第一次遍历把所有非0的元素赋给指针j
     * 第二次遍历将末尾的元素都赋成0
     * @param nuns
     * @return
     */
    private static int[] solution(int[] nuns){
        if (nuns == null) return null;
        int j = 0;
        for (int i = 0; i < nuns.length; i++) {
            if (nuns[i] != 0){
                nuns[j] = nuns[i];
                j++;
            }
        }
        for (int i = j; i < nuns.length; i++) {
            nuns[i] = 0;
        }
        return nuns;
    }

}
