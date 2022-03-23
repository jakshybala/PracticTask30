package Animal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Author GrayCode
 */
public class MainMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Beksultan");
        map.put(3, "Aizhan");
        map.put(5, "Maksat");
        System.out.println("Foreach");
        map.forEach((integer, s) -> System.out.println(integer + " " + s));
        System.out.println("Stream");
        map.entrySet().stream().forEach(System.out::println);
//        map.entrySet().stream().forEach(System.out.println(map.keySet() + "" map.values()));
        System.out.println("Foreach");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        }
    }
}
