package Ex01;

import java.util.*;

public class UseMethodsWithHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.addAll(List.of(34, 12, 23, 45, 67, 34, 98));
        System.out.println(set);
        set.add(23);
        System.out.println(set);
        set.remove(67);
        System.out.println(set);
        System.out.println("Indeholder settet 23? " + set.contains(23));
        System.out.println("Indeholder " + set.size() + " tal");
    }
}