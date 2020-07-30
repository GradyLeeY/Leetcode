package Daily;

/**1+22+333+444+...+nnnn
 * @author grady
 * @date 2020 20-7-30 上午10:09
 */
public class IntegerCount {

    public static void main(String[] args) {
        IntegerCount integerBreak = new IntegerCount();
        System.out.println(integerBreak.solution(4));
    }
    private int solution(int n){
        int result = 0;
        int k = 1;
        for (int i = 1; i <= n; i++) {
            result += i*k;
            k = k*10+1;
        }
        return result;
    }
}
