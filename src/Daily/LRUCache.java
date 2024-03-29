package Daily;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author ying.li
 * @version 1.0
 * @ClassName LRUCache
 * @Description TODO
 * @date 2021/3/24 11:48
 **/
public class LRUCache {

    int capacity;
    Map<Integer,Integer> map;

    public LRUCache(int capacity){
        this.capacity = capacity;
        map = new LinkedHashMap<>();
    }

    public int get(int key){
        //如果没有找到
        if (!map.containsKey(key)){
            return -1;
        }
        //找到了就刷新数据
        Integer value = map.remove(key);
        map.put(key,value);
        return value;
    }

    public void put(int key,int value){
        if (map.containsKey(key)){
            map.remove(key);
            map.put(key,value);
            return;
        }
        map.put(key,value);
        //超出capacity，删除最久没用的即第一个,或者可以复写removeEldestEntry方法
        if (map.size() > capacity){
            map.remove(map.entrySet().iterator().next().getKey());
        }
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(10);
        for (int i = 0; i < 10; i++) {
            lruCache.map.put(i,i);
            System.out.println(lruCache.map.size());
        }
        System.out.println("初始化："+lruCache.map);
        lruCache.put(10,200);
        System.out.println("put后："+lruCache.map);
    }
}
