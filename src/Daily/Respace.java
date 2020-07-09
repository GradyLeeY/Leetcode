package Daily;

import java.util.Arrays;

/**
 * @author grady
 * @date 2020 20-7-9 下午2:20
 */
public class Respace {

    public static void main(String[] args) {
        String[] dictionary = {"looked","just","like","her","brother"};
        String sentenc = "jesslookedjustliketimherbrother";
        Respace respace = new Respace();
        System.out.println(respace.solution(dictionary, sentenc));
    }
    private  int solution(String[] dictionary,String sentenc){
        int n = sentenc.length();
        Trie root = new Trie();
        for (String word:dictionary
             ) {
            root.insert(word);
        }
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            Trie curPos = root;
            for (int j = i; j >= 1; --j) {
                int t = sentenc.charAt(j - 1) - 'a';
                if (curPos.next[t] == null){
                    break;
                }else if (curPos.next[t].isEnd){
                    dp[i] = Math.min(dp[i],dp[j-1]);
                }
                if (dp[i] == 0){
                    break;
                }
                curPos = curPos.next[t];
            }
        }
        return dp[n];
    }

    class Trie{
        public Trie[] next;
        public boolean isEnd;

        public Trie(){
            next = new Trie[26];
            isEnd = false;
        }

        public void insert(String s){
            Trie curPos = this;
            for (int i = s.length() - 1; i >= 0; i--) {
                int t = s.charAt(i) - 'a';
                if (curPos.next[t] == null){
                    curPos.next[t] = new Trie();
                }
                curPos = curPos.next[t];
            }
            curPos.isEnd = true;
        }
    }
}
