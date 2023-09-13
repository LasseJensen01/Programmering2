package Ex03;
import java.util.ArrayList;
import java.util.List;

public class Ex03 {

    private static ArrayList<Integer> list = new ArrayList<>(List.of(8, 56, 45, 34, 15, 12, 34, 44));
    public static void main(String[] args) {
        mergesort(list);
        System.out.println(list);
    }

    public static void mergesort(ArrayList<Integer> list){
        mergesort(list, 0,list.size() - 1 );
    }
    private static void mergesort(ArrayList<Integer> list, int low, int high)
    {
        if (low < high) {
            int middle = (low + high) / 2;
            mergesort(list, low, middle);
            mergesort(list, middle + 1, high);
            merge(list, low, middle, high);
        }
    }

    private static void merge(ArrayList<Integer> list, int l, int m, int h ) {
        int i1 = l;
        int i2 = m + 1;

        ArrayList<Integer> temp = new ArrayList<>();

        while (i1 <= m && i2 <= h){
            if (list.get(i1) <= list.get(i2)){
                temp.add(list.get(i1));
                i1++;
            } else{
                temp.add(list.get(i2));
                i2++;
            }
        }
        while(i1 <= m){
            temp.add(list.get(i1));
            i1++;
        }
        while(i2 <= h){
            temp.add(list.get(i2));
            i2++;
        }
        for (int i = 0; i < temp.size(); i++){
            list.set(l + i, temp.get(i));
        }
    }

    /*
                 [13, 7, 48, 17, 24, 8, 5, 33]
                      /               \
               [13, 7, 48, 17]  [24, 8, 5, 33]
               /         \        /         \
          [13, 7]   [48, 17] [24, 8]       [5, 33]
           /  \       /  \    /  \          /  \
         [13] [7] [48] [17] [24] [8]      [5] [33]
     */
}
