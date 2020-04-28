package chapter1.section3;

import java.util.Iterator;

/*
 * A FIFO queue (or just a queue) is a collection that is based on the first-
 * in-first-out (FIFO) policy.
 */
public class Queue<Item> implements Iterable<Item> {

    private Node<Item> first;
    private Node<Item> last;
    private int size;

    public Queue() {
        size = 0;
        first = new Node<Item>(null, null);
        last = first;
    }

    public void enqueue(Item item) {
        Node<Item> n = new Node<Item>(item, null);
        last.setNext(n);
        last = n;
        size++;
    }

    public Item dequeue() {
        Item r = first.next().item();
        first.setNext(first.next().next());
        size--;
        return r;
    }

    public int size() {
        return size;
    }

    public Iterator<Item> iterator() {
        return new queueIterator();
    }

    private class queueIterator implements Iterator<Item> {
        private Node<Item> node = first.next();

        @Override
        public boolean hasNext() {
            return size != 0 && node.next() != null;
        }

        @Override
        public Item next() {
            Item r = node.item();
            node = node.next();
            return r;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
