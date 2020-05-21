package Array;

public class PlusOne {

    public static void main(String[] args) {
        int[] nums = {9,2,9};
        int[] solution = solution(nums);
        for (int n:solution
             ) {
            System.out.println(n);
        }
    }

    /**
     * 模拟进位，对数组中的最后一个元素开始遍历，+1之后对10 取余
     * 如果取余不是零就返回整个数组，如果取余是0就继续遍历
     * 如果+1取余后都是0，也就是所有位置都是9，此时将原数组扩容1位，第一个元素置为1
     * @param digits
     * @return
     */
    private static int[] solution(int[] digits){
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

    }
}
