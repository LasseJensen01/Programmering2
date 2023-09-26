package Ex03;

import java.security.Key;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Opgave3_A();
        Opgave3_B();

    }

    public static void Opgave3_A(){
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);

        Iterator<Integer> iterator = list.iterator();
        int nr = 0;
        while (iterator.hasNext()){
            nr = iterator.next();
            System.out.println(nr);
        }
    }

    public static void Opgave3_B(){
        Map<Integer, Integer> map = Map.of(2,4, 3,9, 4, 16, 5, 25, 6,36);
        Set<Integer> keySet = map.keySet();
        Iterator<Integer> iterator = keySet.iterator();

        int nr = 0;
        while (iterator.hasNext()){
            nr = iterator.next();
            System.out.printf("(" + nr + "," + map.get(nr) + ")");
        }
    }
}
