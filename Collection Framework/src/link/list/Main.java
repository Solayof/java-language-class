package link.list;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.remove(1);
        System.out.println(list.get(0));
        Collections.reverse(list);
        for (int i: list) {
            System.out.println(i);
        }
    }
}