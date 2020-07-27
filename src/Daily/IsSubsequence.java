package Daily;

/**判断子序列
 * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 * s = "abc", t = "ahbgdc"
 * @author grady
 * @date 2020 20-7-27 下午1:58
 */
public class IsSubsequence {

    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        IsSubsequence isSubsequence = new IsSubsequence();
        System.out.println(isSubsequence.solution(s, t));
    }
    /**
     * 贪心匹配
     * 初始化指针i和j，分别指向s和t的起始位置，每次贪心匹配，如果匹配成功那么同时右移
     * 匹配s 的下一个位置，匹配失败那么j右移，i不变，尝试用t的下一个字符匹配s
     * 如果最终i移动到s的末尾，则表示s是t的子串
     * @param s
     * @param t
     * @return
     */
    private boolean solution(String s , String t){

        int n = s.length(),m = t.length();

        int i = 0,j = 0;

        while (i < n && j < m){
            if (s.charAt(i) == t.charAt(j)){
                i++;
            }
            j ++;
        }
        return i == n;
    }
}
