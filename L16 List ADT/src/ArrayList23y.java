import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayList23y <E> implements List23Y{
    private final int initialCapcacity = 0;
    private E[] data = (E[])new Object[initialCapcacity];

    public ArrayList23y() {
    }

    @Override
    public void add(Object o) {
        E[] newArr = (E[])new Object[data.length + 1];
        for (int i = 0; i < data.length; i++) {
            newArr[i] = data[i];
        }
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public void add(int index, Object o) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
