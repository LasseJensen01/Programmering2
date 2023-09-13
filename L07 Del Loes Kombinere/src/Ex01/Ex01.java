package Ex01;

import java.util.List;

public class Ex01 {
    private static int count = 0;
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println(recursiveSum(list));
        System.out.println(count);
    }
    public static int recursiveSum(List<Integer> list){
        return recursiveSum(list, 0,list.size()-1);
    }

    private static int recursiveSum(List<Integer> list, int l, int h){
        if (l == h){
            return list.get(l);
        } else{
            int m = (l + h) / 2;
            int sum1 = recursiveSum(list, l, m);
            int sum2 = recursiveSum(list, m+1, h);
            count++;
            return sum1 + sum2;
        }
    }
}
