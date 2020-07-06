package Daily;

/**不同路径 II
 *
 * @author grady
 * @date 2020 20-7-6 下午1:32
 */
public class UniquePathsWithObstacles {

    public static void main(String[] args) {
        int[][] obstacleGrid= {
                            {0,0,0},
                            {0,1,0},
                            {0,0,0}
        };
        System.out.println(solution(obstacleGrid));
    }
    private static int solution(int[][] obstacleGrid){
        int m = obstacleGrid.length,n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m && obstacleGrid[i][0] == 0; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n && obstacleGrid[0][i] == 0; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 0){
                    dp[i][j] = dp[i -1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
