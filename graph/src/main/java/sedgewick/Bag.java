package sedgewick;

import java.util.Iterator;

/**
 * @author Dhiraj
 * @date 01/08/19
 */
public class Bag<Integer> implements Iterable<Integer> {
    private Node first;

    @Override
    public Iterator<Integer> iterator() {
        return new ListIterator();
    }

    public void add(Integer item) {
        Node oldFirst = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    private class Node {
        Integer item;
        Node next;
    }

    private class ListIterator implements Iterator<Integer> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Integer next() {
            return null;
        }

        @Override
        public void remove() {

        }
    }
}
