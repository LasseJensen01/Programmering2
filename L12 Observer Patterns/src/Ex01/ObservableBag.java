package Ex01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ObservableBag implements Bag{
    private ArrayList<Observer> observers = new ArrayList<>();
    private HashMap<Integer, String> inventory = new HashMap<>();
    private int key = 1;
    @Override
    public void add(String s) {
        inventory.put(key, s);
        key++;

    }

    @Override
    public void remove(String s) {

    }

    @Override
    public int getCount(String s) {
        int sum = 0;
        for (String entry : inventory.values()){
            if (entry.equals(s)){
                sum++;
            }
        }
        return sum;
    }

    @Override
    public void notifyObservers(String s) {
        for (Observer o : observers){
            o.update(s, getCount(s));
        }
    }
}
