import java.security.KeyException;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Maps {
    public static void main(String... args) {

        java.util.Map map1 = new java.util.HashMap<>();
        java.util.Map map2 = new java.util.LinkedHashMap<>();
        java.util.Map map3 = new java.util.TreeMap<>();


        map1.put(123, "ahsan");
        map1.put(1, 34);
        map1.get(123);
        map2.put(1234, "ahsan123");
        map2.get(1234);
        map3.put(12345, "ahsan12334");
        map3.get(12345);
        System.out.println(map1.containsKey(1));
        System.out.println(map1.containsValue("ahsan"));
        System.out.println(map1.size());
        System.out.println(map1.values());
        System.out.println(((LinkedHashMap) map1).clone());
//        System.out.println(map2);
        System.out.println(map3);

    }
}