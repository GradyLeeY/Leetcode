package Daily;

/**
 * @author grady
 * @date 2020 20-8-3 下午1:43
 */
public class AddString {

    public static void main(String[] args) {
        AddString addString = new AddString();
        System.out.println(addString.solution("123", "38"));
    }

    /**
     * 我们定义两个指针i和j分别指向num1 和num2的末尾，同时定义一个add来维持进位然后从末尾开始到开头逐位相加
     * 如果两个数字的位数不相同的话，那么在下标小于0时统一做返回0处理，等价于对位数较短的字符串在前面做了补0的处理
     * @param num1
     * @param num2
     * @return
     */
    private String solution(String num1,String num2){
        int i = num1.length() -1,j = num2.length() -1,add = 0;

        StringBuilder builder = new StringBuilder();
        while (i >= 0 || j >= 0 || add != 0){
            int x = i >= 0? num1.charAt(i) - '0': 0;
            int y = j >= 0? num2.charAt(j) - '0': 0;
            int result = x + y + add;
            builder.append(result%10);
            add = result / 10;
            i --;
            j --;
        }
        builder.reverse();
        return builder.toString();
    }
}
