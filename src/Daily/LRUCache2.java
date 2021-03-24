package Daily;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ying.li
 * @version 1.0
 * @ClassName LRUCache2
 * @Description TODO
 * @date 2021/3/24 13:44
 **/
public class LRUCache2 {

    private int capacity;
    private Map<Integer,ListNode>map;
    private ListNode head;
    private ListNode tail;

    public LRUCache2(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
        head = new ListNode(-1,-1);
        tail = new ListNode(-1,-1);
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key){
        if (!map.containsKey(key)){
            return -1;
        }
        ListNode node = map.get(key);
        node.pre.next = node.next;
        node.next.pre = node.pre;
        return node.val;
    }

    public void put(int key,int value){
        if (get(key)!=-1){
            map.get(key).val = value;
            return;
        }
        ListNode node = new ListNode(key,value);
        map.put(key,node);
        moveToTail(node);

        if (map.size() > capacity){
            map.remove(head.next.key);
            head.next = head.next.next;
            head.next.pre = head;
        }
    }

    //把节点移动到尾巴
    private void moveToTail(ListNode node) {
        node.pre = tail.pre;
        tail.pre = node;
        node.pre.next = node;
        node.next = tail;
    }

    //定义双向链表节点
    private class ListNode{
        int key;
        int val;
        ListNode pre;
        ListNode next;

        //初始化双向链表
        public ListNode(int key,int val){
            this.key = key;
            this.val = val;
            pre = null;
            next = null;
        }
    }
}
