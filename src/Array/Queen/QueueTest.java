package Array.Queen;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author grady
 * @date 2020 20-7-17 下午4:30
 */
public class QueueTest {

    public static void main(String[] args) {
        Queue <String> msg = new ArrayBlockingQueue<String>(3);
        msg.add("第一个数据");//集合的方法
        msg.offer("第二个数据");//队列的方法
        msg.poll();//查询并删除队首元素
        msg.element();//只查询队首元素
    }
}
