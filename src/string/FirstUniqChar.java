package string;

import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector;

import java.util.HashMap;
import java.util.Map;

/**
 * 字符串中的第一个唯一字符
 * @author grady
 * @date 20-5-28 下午4:23
 */
public class FirstUniqChar {

    public static void main(String[] args) {
        System.out.println(solution("loveleetcode"));
    }

    /**
     * 先遍历一遍字符串，将出现的字符进行计数，并放入map中
     * 再遍历一遍，如果一个字符在map中出现的次数为1则返回下标
     * 否则返回-1
     * @param s
     * @return
     */
    private static int solution(String s){
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i))==1) return i;
        }
        return -1;
    }
}
