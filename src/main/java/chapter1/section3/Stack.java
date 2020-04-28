package chapter1.section3;

import java.util.Arrays;
import java.util.Iterator;

/*
 * A pushdown stack (or just a stack) is
 * a collection that is based on the last-in-first-out (LIFO)
 * policy.
 */
public class Stack<Item> implements Iterable<Item> {

    private Item[] items;
    private int capacity = 16; // capacity of Stack
    private int size;

    @SuppressWarnings("unchecked")
    public Stack() {
        size = 0;
        items = (Item[]) new Object[capacity];
    }

    public Stack(int capacity) {
        this();
        this.capacity = capacity;
    }

    private void expand() {
        capacity <<= 1;
        items = Arrays.copyOf(items, capacity);
    }

    public void push(Item item) {
        items[size] = item;
        size++;
        if (size == capacity) expand(); // if Stack is full, double capacity
    }

    public Item pop() {
        size--;
        return items[size];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    public Iterator<Item> iterator() {
        return new stackIterator();
    }

    private class stackIterator implements Iterator<Item> {
        private int i = size;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            i--;
            return items[i];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
