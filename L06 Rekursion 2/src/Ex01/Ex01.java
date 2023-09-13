package Ex01;

public class Ex01 {
    public static void main(String[] args) {
        int[] list = new int[30];
        for (int i = 0; i < 30; i++) {
            list[i] = i;
        }
        System.out.println(sum(list));;
    }

    public static int sum(int[] list){
        return sum(list,0);
    }
    private static int sum(int[] list, int index){
        int result = 0;
        if (index == list.length){
            result = 0;
        } else {
            int element = list[index];
            if ((element&2) == 0){
                result = 1;
            }
        }
        return result;
    }


}
