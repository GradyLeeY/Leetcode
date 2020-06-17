package Daily;

import java.util.HashMap;
import java.util.Stack;

/**给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 有效字符串需满足：
 左括号必须用相同类型的右括号闭合。
 左括号必须以正确的顺序闭合。
 注意空字符串可被认为是有效字符串。
 * @author grady
 * @date 20-6-17 上午10:56
 */
public class ValidBrackets {

    public static void main(String[] args) {
        ValidBrackets validBrackets = new ValidBrackets();
        String s = "()[]{}";
        System.out.println(validBrackets.valid(s));
    }
    private HashMap<Character,Character> mappgings;
    public ValidBrackets(){
        this.mappgings = new HashMap<Character, Character>();
        this.mappgings.put(')', '(');
        this.mappgings.put('}', '{');
        this.mappgings.put(']', '[');
    }
    private  boolean valid(String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //如果mappgings 中包含s中的字符
            if (mappgings.containsKey(c)){
                //取出栈中的第一个元素
                char topElement = stack.isEmpty()?'#':stack.pop();
                //如果栈中的第一个元素和mappings中的元素不相等
                if (topElement != mappgings.get(c)){
                    return false;
                }
            }else {
                //如果mappings中没有这个元素，将这个元素加入栈中
                stack.push(c);
            }
        }
        //如果最后栈中依旧有元素，返回invalid
        return stack.isEmpty();
    }
}
