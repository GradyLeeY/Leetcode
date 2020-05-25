package Array.String;

/**
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * @author grady
 * @date 20-5-25 下午6:01
 */
public class ReverseString {


    /**
     * 采用前后双指针
     * @param s
     */
    private static void solution(char[] s){
        int left = 0;
        int right = s.length-1;
        char temp;

        while (left < right){
            temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }

}
