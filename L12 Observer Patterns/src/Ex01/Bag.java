package Ex01;

public interface Bag {
    public void add(String s);
    public void remove(String s);
    public int getCount(String s);
    public void notifyObservers(String s);
}
