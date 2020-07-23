package Daily;

/**最小路径和
 * 给定一个二维数组，计算从左上角到右下角的最短路径
 * @author grady
 * @date 2020 20-7-23 上午9:51
 */
public class MinPathSum {

    /**
     * 动态规划解法，由于路径只能从上到下，从左到右，因此每个元素对应的最小路径即为对应路径上的数字总和
     * @param grid
     * @return
     */
    private int solution(int[][] grid){

        if (grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        int rows = grid.length,colums = grid[0].length;

        int[][] dp = new int[rows][colums];

        dp[0][0] = grid[0][0];

        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < colums; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < colums; j++) {
                dp[i][j] = Math.min(dp[i -1][j],dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[rows - 1][colums - 1];
    }
}
