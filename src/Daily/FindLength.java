package Daily;

/**给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
 * https://assets.leetcode-cn.com/solution-static/718/718_fig1.gif
 * @author grady
 * @date 20-7-1 下午1:38
 */
public class FindLength {

    public static void main(String[] args) {
        FindLength findLength = new FindLength();
        int[]nums1 = {1,2,3,2,1};
        int[]nums2 = {3,2,1,4,7};
        System.out.println(findLength.solution2(nums1, nums2));
    }
    public int solution(int[]A,int[]B){
        int n = A.length,m = B.length;//int n = A.length, m = B.length;
        int ret = 0;
        for (int i = 0; i < n; i++) {
            int len = Math.min(m,n-i);
            int maxlen = maxLenght(A,B,i,0,len);
            ret = Math.max(ret,maxlen);
        }

        for (int i = 0; i < m; i++) {
            int len = Math.min(n,m - i);
            int maxlen = maxLenght(A,B,0,i,len);
            ret = Math.max(ret,maxlen);
        }
        return ret;
    }

    public int solution2(int[]A,int[]B){
        int n = A.length,m = B.length;
        int[][]dp = new int[n+1][m+1];
        int ans = 0;
        for (int i = n-1; i >= 0; i--) {
            for (int j = m-1; j >= 0 ; j--) {
                dp[i][j] = A[i] == B[j]?dp[i+1][j+1]+1:0;
                ans = Math.max(ans,dp[i][j]);
            }
        }
        return ans;
    }
    private int maxLenght(int[] A, int[] B, int addA, int addB, int len) {
        int ret = 0,k = 0;
        for (int i = 0; i < len; i++) {
            if (A[addA + i] == B[addB + i]){
                k++;
            }else {
                k = 0;
            }
            ret = Math.max(ret,k);
        }
        return ret;
    }
}
