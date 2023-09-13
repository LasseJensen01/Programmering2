package Ex02;

import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,0,4,0,6,7,0,9);
        System.out.println(recursiveCount(list));
    }
    public static int recursiveCount(List<Integer> list){
        return recursiveCount(list, 0,list.size()-1);
    }

    private static int recursiveCount(List<Integer> list, int l, int h){
        if (l == h){
            if (list.get(l) == 0){
                return 1;
            }else {
                return 0;
            }
        } else{
            int m = (l + h) / 2;
            int sum1 = recursiveCount(list, l, m);
            int sum2 = recursiveCount(list, m+1, h);
            return sum1 + sum2;
        }
    }
}
