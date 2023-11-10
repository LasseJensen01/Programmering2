package Package02;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time = LocalTime.now();
        time.plusSeconds(1);
        while(true) {
            System.out.println(LocalTime.now().toString());
            TimeUnit.SECONDS.sleep(1);
        }
    }
    public static void anders(){
        ArrayList<Integer> fuck = new ArrayList<>();
    }
}
