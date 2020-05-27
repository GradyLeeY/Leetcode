package string;

/**
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * @author grady
 * @date 20-5-27 下午5:37
 */
public class Strstr {


    public static void main(String[] args) {
        System.out.println(solution2("heoll", "ll"));
    }
    //https://pic.leetcode-cn.com/Figures/28/substrings.png
    private static int solution(String haystack,String needle){
        int lengthStask = haystack.length();
        int lengthNeed = needle.length();

        for (int start = 0; start < lengthStask - lengthNeed + 1; ++start) {
            if (haystack.substring(start,start+lengthNeed).equals(needle)){
                return start;
            }
        }
        return -1;
    }
    private static int solution2(String haystack,String needle){
        return haystack.indexOf(needle);
    }
}
