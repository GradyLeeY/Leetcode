package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * @author grady
 * @date 20-6-16 下午3:28
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String str = "bbbbb";
        System.out.println(solution(str));
    }

    /**
     *
     * @param s
     * @return
     */
    private static int solution(String s){
        Set<Character>set = new HashSet<>();
        int n = s.length();
        //right = -1代表此时右指针在最左侧，滑动窗口还没开始
        int ans = 0,right = -1;
        for (int i = 0; i < n; i++) {
            if (i != 0){
                //移出第k个字符
                set.remove(s.charAt(i-1));
            }
            while (right+i < n && !set.contains(s.charAt(right+1))){
                set.add(s.charAt(right+1));
                right++;
            }
            ans = Math.max(ans,right+1-i);
        }
        return ans;
    }
}
