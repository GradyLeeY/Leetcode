package Daily;

/**
 * 假设你正在爬楼梯，需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶，你有多少种不同的方法可以爬到楼顶呢？
 * 符合斐波那契数列
 * @author grady
 * @date 20-6-10 下午7:09
 */
public class ClimbStairs {

    public static void main(String[] args) {
        System.out.println(solution(11));
    }
    private static int solution(int n){
        if (n == 1){
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first+second;
            first = second;
            second = third;
        }
        return second;
    }

}
