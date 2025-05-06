package hashset;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();

        strings.add("Moses");
        strings.add("Solomon");
        strings.add("Oladapo");

        System.out.println(strings);
        System.out.println(strings.contains("Moses"));
        strings.remove("Moses");
        System.out.println(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
