package array.list;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Solomon");
        arrayList.add("Ayofemi");
        arrayList.add("Moses");

        arrayList.remove(1);
        arrayList.add("Joy");
        arrayList.remove("Solo");

        Collections.sort(arrayList);

        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        for (String name: arrayList) {
            System.out.println(name);
        }
    }


}
