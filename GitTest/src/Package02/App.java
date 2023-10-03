package Package02;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time = LocalTime.now();
        time.plusSeconds(1);
        while (true){
            String tim = time.toString();
            int index = tim.lastIndexOf('.');
            tim = tim.substring(0,index);
            System.out.println(tim);
            time = time.plusSeconds(1);
            TimeUnit.SECONDS.sleep(1);

        }
    }
}
