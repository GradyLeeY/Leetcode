package Daily;

import java.util.Arrays;

/**
 * @author grady
 * @date 2020 20-7-8 下午5:02
 */
public class Divingboard {


    public static void main(String[] args) {
        int[] solution = solution(2, 1118596, 979);
        System.out.println(Arrays.toString(solution));
    }
    /**
     * 1 当k = 0时 返回一个空数组
     * 2 当shorter = longer时,数组长度为1，长度为k*shorter
     * 3 正常情况下 最短为k*shorter ，最长为k*longer，那所有的长度介于中间，longer增加一块，总长度就增加(longer-shorter)
     * @param shorter
     * @param longer
     * @param k
     * @return
     */
    private static int[] solution(int shorter, int longer, int k){
        if (k == 0) {
            return new int[0];
        }
        if (shorter == longer) {
            return new int[]{shorter * k};
        }
        int[] lengths = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            lengths[i] = shorter * (k - i) + longer * i;
        }
        return lengths;

    }

}
