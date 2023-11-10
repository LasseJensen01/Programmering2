package queue23ystudent;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Objects;

class Node<E>{
    E element;
    Node<E> next;
    public Node(E e){
        element = e;
    }
    @Override
    public String toString() {
        return "" + element;
    }
}
public class SingleLinkedQueue23Y<E> implements Queue23Y{
    private Node<E> head = null;
    private Node<E> tail = null;

    @Override
    public void add(Object element) {
        Node<E> node = new Node<E>((E) element);
        if (Objects.isNull(head)){
            head = node;
            tail = head;
        } else if (Objects.isNull(head.next)){
            head.next = node;
            tail = head.next;
        } else {
            tail.next = node;
            tail = tail.next;
        }
    }

    @Override
    public Object remove() {
        if (Objects.isNull(head)){
            throw new NoSuchElementException();
        }
        Node node = head;
        head = head.next;
        return node;
    }

    @Override
    public Object element() {
        if (Objects.isNull(head)){
            throw new NoSuchElementException();
        }
        return head;
    }

    @Override
    public boolean isEmpty() {
        if (Objects.isNull(head) && Objects.isNull(tail)){
            return true;
        } else return false;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
    }

    @Override
    public int size() {
        int sum = 0;
        Node<E> current = head;
        while (!Objects.isNull(current)){
            sum++;
            current = current.next;
        }
        return sum;
    }
}
