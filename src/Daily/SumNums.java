package Daily;

/**
 * 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * @author grady
 * @date 20-6-2 上午10:41
 */
public class SumNums {

    public static void main(String[] args) {
        System.out.println(solution(3));
    }
    private static int solution(int n){
        boolean x = n > 1 && (n += solution(n - 1)) >0;
        return n;
    }
}
