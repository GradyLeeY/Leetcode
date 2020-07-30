package Daily;

/**
 * @author grady
 * @date 2020 20-7-30 上午10:19
 */
public class IntegerBreak {

    public static void main(String[] args) {
        IntegerBreak integerBreak = new IntegerBreak();
        System.out.println(integerBreak.solution(5));
    }
    private int solution(int n){
        int[] dp = new int[n+1];
        for (int i = 2; i <= n; i++) {
            int curMax = 0;
            for (int j = 1; j < i; j++) {
                curMax = Math.max(curMax,Math.max(j*(i - j),j * dp[i-j]));
            }
            dp[i] = curMax;
        }
        return dp[n];
    }
}
