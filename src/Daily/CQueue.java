package Daily;

import java.util.Deque;
import java.util.LinkedList;

/**Stack官方已经不建议使用了，现在栈的实现最好就是用Deque<Integer> stack = new LinkedList<>()
 *用两个栈实现队列
 * 栈是先进后出，队列是先进先出
 * https://assets.leetcode-cn.com/solution-static/jianzhi_09/jianzhi_9.gif
 * @author grady
 * @date 20-6-30 下午2:35
 */
public class CQueue {

    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(1);
        cQueue.appendTail(2);
        System.out.println(cQueue.deleteHead());
        cQueue.appendTail(4);
        System.out.println(cQueue.deleteHead());
    }
    /**
     * 维护两个栈，一个栈支持插入操作，一个栈支持删除操作，栈是从头部开始插入元素，队列是从尾部插入元素
     */
    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public CQueue(){
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value){
        stack1.push(value);
    }

    public int deleteHead(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()){
            return -1;
        }else {
            int deleteItem = stack2.pop();
            return deleteItem;
        }
    }
}
