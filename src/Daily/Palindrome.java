package Daily;

/**判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * @author grady
 * @date 20-6-10 下午7:22
 */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }
    private static boolean isPalindrome(int x){
        //特殊情况，如果x<0是附属那肯定不是回文数
        //如果x不是0并且x对10取余为0那也意味着不是回文数
        if (x < 0 || (x%10==0 && x != 0)){
            return false;
        }
        int temp = 0;
        while (x > temp){
            temp = temp*10+x%10;
            x = x/10;
        }
        //当x是奇数的时候，可以通过判断temp/10去除中位的数字
        //比如12321
        return x == temp || x == temp/10;
    }
}
