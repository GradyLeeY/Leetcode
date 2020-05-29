package string;

import java.util.Arrays;

/**
 * 有效的字母异位词(出现的字母相同并且次数页一样)
 * @author grady
 * @date 20-5-29 下午3:37
 */
public class IsAnagram {

    public static void main(String[] args) {
        String s = "rat", t = "rat";
        System.out.println(solution(s, t));
    }

    private static boolean solution(String s,String t){
        if (s.length() != t.length()) return false;
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1,str2);
    }
}
