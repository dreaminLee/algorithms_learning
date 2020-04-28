package chapter1;

/*
* Node class for implementing Queue class
* */
class Node<Item> {
    private Item item;
    private Node<Item> next;

    Node(Item item, Node<Item> next) {
        this.item = item;
        this.next = next;
    }

    Node<Item> next() {
        return next;
    }

    Item item() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setNext(Node<Item> next) {
        this.next = next;
    }
}
