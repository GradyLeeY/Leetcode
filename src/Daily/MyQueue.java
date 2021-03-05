package Daily;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author grady
 * @version 1.0
 * @ClassName MyQueue
 * @Description 将一个栈作为输入栈用于push压入数据，一个栈作为输出栈用于pop和peek操作，每次pop或者peek时要是输出栈为空
 * 则将全部的输入栈的数据push到输出栈中
 * @date 2021/3/5 11:24
 **/
public class MyQueue {
    Deque<Integer> inStack;
    Deque<Integer> outStack;

    public MyQueue(){
        inStack = new LinkedList<>();
        outStack = new LinkedList<>();
    }

    public void push(int x){
        inStack.push(x);
    }

    public int pop(){
        if (outStack.isEmpty()){
            in2out();
        }
        return outStack.pop();
    }

    public int peek(){
        if (outStack.isEmpty()){
            in2out();
        }
        return outStack.peek();
    }
    public boolean empty(){
        return inStack.isEmpty() && outStack.isEmpty();
    }
    private void in2out() {
        while (!inStack.isEmpty()){
            outStack.push(inStack.pop());
        }
    }
}
