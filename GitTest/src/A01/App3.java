package A01;
public class App3 {
    public static void main(String[] args) {
        System.out.println(method(3));
        System.out.println(method(5));
    }
    public static int method(int n){
        if (n == 1){
            return 1;
        }
        return method(n-1) * 10 + n;
    }
}

