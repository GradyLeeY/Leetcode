package Daily;

/**最佳观光组合A[i]
 * mx = （A[i] + A[j] + i - j）
 * @author grady
 * @date 20-6-17 下午2:14
 */
public class MaxScoreSightseeingPair {

    public static void main(String[] args) {
        int[]A = {8,1,5,2,6};
        System.out.println(solution(A));
    }
    private static int solution(int[] A){
        int ans = 0,mx = A[0]+0;
        for (int j = 1; j < A.length; j++) {
            ans = Math.max(ans,mx+A[j]-j);
            mx = Math.max(mx,A[j]+j);
        }
        return ans;
    }
}
