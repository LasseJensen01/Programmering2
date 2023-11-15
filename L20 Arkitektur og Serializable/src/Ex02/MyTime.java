package Ex02;

import java.io.Serializable;
import java.util.List;

public class MyTime implements Serializable {
    private List<String> times;
    private int time = 0;

    public void increase(){
        time++;
    }
    public void reset(){
        time = 0;
    }

    public int getTime() {
        return time;
    }
    public void saveTimes(){
        times.add("" + time);
    }
}
