package Daily;

import java.util.HashSet;
import java.util.Set;

/**
 * @author grady
 * @date 20-6-18 下午3:23
 */
public class ShortSet {

    public static void main(String[] args) {
        Set<Short> shorts = new HashSet<>();
        for (short i = 0; i < 100; i++) {
            shorts.add(i);
            shorts.remove((short)(i-1));
        }
        //因为set里面是short类型的数据，而我们移除的int类型，所以打印出来的是100,加上多态向下转型就可正常移除
        System.out.println(shorts.size());
    }
}
