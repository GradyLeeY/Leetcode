package Daily;

/**二进制求和
 * @author grady
 * @date 20-6-23 下午2:44
 */
public class AddBinary {

    public static void main(String[] args) {
        System.out.println(solution("111", "10101"));
    }
    private static String solution(String a,String b){
        StringBuilder stringBuilder = new StringBuilder();
        int n = Math.max(a.length(),b.length()),carry = 0;
        for (int i = 0; i < n; i++) {
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            stringBuilder.append((char) (carry % 2 + '0'));
            carry /= 2;
        }
        if (carry > 0) {
            stringBuilder.append('1');
        }
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
