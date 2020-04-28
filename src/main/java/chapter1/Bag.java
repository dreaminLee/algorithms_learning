package chapter1;

import java.util.Arrays;
import java.util.Iterator;

/*
 * A bag is a collection where removing items is not supported—its purpose is to
 * provide clients with the ability to collect items and then to iterate through the collected
 * items (the client can also test if a bag is empty and find its number of items). The order
 * of iteration is unspecified and should be immaterial to the client.
 */
public class Bag<Item> implements Iterable<Item> {

    private Item[] items;
    private int capacity = 16; // capacity of Bag
    private int size;

    @SuppressWarnings("unchecked")
    public Bag() {
        size = 0;
        items = (Item[]) new Object[capacity];
    }

    private void expand() {
        capacity <<= 1;
        items = Arrays.copyOf(items, capacity);
    }

    public void add(Item item) {
        items[size] = item;
        size++;
        if (size == capacity) expand();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public Iterator<Item> iterator() {
        return new bagIterator();
    }

    private class bagIterator implements Iterator<Item> {

        private int i = 0;

        @Override
        public boolean hasNext() {
            return i < size;
        }

        @Override
        public Item next() {
            Item r = items[i];
            i++;
            return r;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
