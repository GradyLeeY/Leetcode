package string;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * @author grady
 * @date 20-5-27 下午2:23
 */
public class ReverseInt {

    public static void main(String[] args) {
        System.out.println(solution(1534236469));
    }
    private static int solution(int x){
        int rev = 0;
        while (x!=0){
            int pop = x%10;
            x = x/10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = 10*rev+pop;
        }
        return rev;
    }
}
