package Daily;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author ying.li
 * @version 1.0
 * @ClassName LRUCache3
 * @Description TODO
 * @date 2021/3/24 14:02
 **/
public class LRUCache3 extends LinkedHashMap<Integer,Integer> {

    private int capacity;

    public LRUCache3(int capacity){
        super(capacity,2.75F,true);
        this.capacity = capacity;
    }
    public int get(int key){
        return super.getOrDefault(key,-1);
    }
    public void put(int key,int value){
        super.put(key,value);
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
