package Ex01;
import java.util.Objects;
public class SortedList<E extends Comparable<E>> implements SortedList23Y<E>{
    private Node<E> head = null;

    @Override
    public void add(E element) {
        Node<E> newNode = new Node<>(element);
        Node<E> index = head;
        if (Objects.isNull(index)) {
            head = newNode;
        } else if (index.element.compareTo(element) > 0) {
            newNode.next = head;
            head = newNode;
        } else {
            while(index.next != null && index.next.element.compareTo(element) > 0) {
                index = index.next;
            }
            newNode.next = index.next;
            index.next = newNode;
        }
    }

    @Override
    public boolean removeFirst() {
        try{
            head = head.next;
            return true;
        }catch (Exception e){
            System.err.println("Error during removeFirst() function: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean removeLast() {
        Node<E> index = head;
        if(index == null){
            return false;
        }
        while (index.next != null){
            index = index.next;
        }
        return false;
    }

    @Override
    public boolean remove(E element) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
    public void print(){
        Node<E> index = head;
        while(index != null){
            System.out.println(index.element);
            index = index.next;
        }
    }

    private static class Node<E> {
        private final E element;
        private Node<E> next;

        public Node(E e) {
            element = e;
        }

        @Override
        public String toString() {
            return "" + element;
        }
    }
}
