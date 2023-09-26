package A01;

import java.util.concurrent.TimeUnit;

public class App2 {
    private static int count = 1;
    private static String s = " ";
    private static String sp = " ".repeat(25);
    private static boolean isLong = false;
    public static void main(String[] args) throws InterruptedException {
        while (true){
            System.out.println(count + s + "***" + sp + "***" + sp + "***");
            count++;
            if (isLong){
                s = s.substring(0,s.length()-2);
                if (s.length() <= 1){
                    isLong = false;
                }
            } else{
                s += "  ";
                if (s.length() >= 30){
                    isLong = true;
                }
            }
            TimeUnit.MILLISECONDS.sleep(30);
        }
    }
}
