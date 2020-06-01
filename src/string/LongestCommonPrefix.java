package string;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * @author grady
 * @date 20-6-1 下午5:00
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(solution(strs));
    }
    private static String solution(String[] strs){
        if (strs.length == 0 || strs == null) return "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || c != strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
