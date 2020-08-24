package Daily;

/**
 * @Author Grady
 * @Date 2020/8/24 22:44
 * @Version 1.0
 */
public class RepeatedSubstringPattern {

    public static void main(String[] args) {
        RepeatedSubstringPattern pattern = new RepeatedSubstringPattern();
        System.out.println(pattern.solution("abab"));
    }
    private boolean solution(String s){
        int n = s.length();
        for (int i = 1; i * 2 <= n; ++i) {
            if (n % i == 0) {
                boolean match = true;
                for (int j = i; j < n; ++j) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }
        }
        return false;

    }
}
