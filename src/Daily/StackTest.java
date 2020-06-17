package Daily;

import java.util.Stack;

/**
 * @author grady
 * @date 20-6-17 上午10:52
 */
public class StackTest {
    public static void main(String[] args) {
        String s = "abdg";
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stack.push(c);
            //pop 和 peek的区别就是pop会取到第一个栈元素并拿出来，peek只会拿到值不改变栈的序列
            char top = stack.pop();
            System.out.println(top);
        }

    }
}
