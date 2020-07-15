package Daily;

/**
 * @author grady
 * @date 2020 20-7-15 下午5:30
 */
public class NumTrees {

    public static void main(String[] args) {
        NumTrees numTrees = new NumTrees();
        System.out.println(numTrees.solution2(5));
    }

    /**
     * 动态规划
     * @param n
     * @return
     */
    public int solution(int n){
        int[] G = new int[n+1];
        G[0] = 1;
        G[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                G[i] += G[j - 1]*G[i - j];
            }
        }
        return G[n];
    }

    /**
     * Catalan数
     * @param n
     * @return
     */
    public int solution2(int n){
        long C = 1;
        for (int i = 0; i < n; i++) {
            C = C*2*(2*i+1)/(i+2);
        }
        return (int)C;
    }
}
