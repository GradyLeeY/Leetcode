package string;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * @author grady
 * @date 20-5-29 下午3:47
 */
public class IsPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(solutuion(s));
    }
    private static boolean solutuion(String s){
        if (s.length() == 0) return true;
        s = s.toLowerCase();
        int i = 0;
        int j = s.length()-1;
        while (i<j){
            if (!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
