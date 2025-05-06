package hashmap;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(20, "Twenty");
        hashMap.put(30, "Thirty");

        System.out.println(hashMap);
        System.out.println(hashMap.size());
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.entrySet());
        System.out.println(hashMap.get(30));
        System.out.println(hashMap.containsKey(20));

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key :" +key + " value :" +value);
        }
    }
}
