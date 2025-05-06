package iterator;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Joy");
        arrayList.add("Bob");
        arrayList.add("Mike");
        arrayList.add("Jack");
        arrayList.add("Jane");

//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
