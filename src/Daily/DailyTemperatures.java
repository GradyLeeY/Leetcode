package Daily;

import java.util.Stack;

/**
 * 请根据每日 气温 列表，重新生成一个列表。对应位置的输出为：要想观测到更高的气温，至少需要等待的天数。如果气温在这之后都不会升高，请在该位置用 0 来代替。
 * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
 * @author grady
 * @date 20-6-12 下午3:19
 */
public class DailyTemperatures {

    public static void main(String[] args) {
        int[] num = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = solutionstack(num);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }

    private static int[] solutionstack(int[] temperatures){
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = temperatures.length - 1; i >= 0 ; i--) {
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
                stack.pop();
            }
            if (stack.isEmpty()){
                res[i] = 0;
            }else {
                res[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return res;
    }
    private static int[] solution(int[]temperatures){
        int length = temperatures.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int current = temperatures[i];
            if (current < 100){
                for (int j = i+1; j < length; j++) {
                    if (temperatures[j] > current){
                        result[i] = j -i;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
