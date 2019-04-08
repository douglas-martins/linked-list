package br.univali.kob.model;

import java.util.Objects;

/**
 * Clss node for the Linked List class.
 * @param <T>: type of the object in the Linked List.
 */
public class Node<T> {
    /**
     * Data of the node.
     */
    private Object data;
    /**
     * Pointer to next Node of the linked list.
     */
    private Node next;

    /**
     * Default constructor of class.
     * @param data: data of the Node.
     */
    public Node(Object data) {
        this.data = data;
        this.next = null;
    }

    /**
     * Get the value of data.
     * @return Object with the value of data.
     */
    public Object getData() {
        return this.data;
    }

    /**
     * Get the value of the next Node.
     * @return Node with the value of the next.
     */
    public Node getNext() {
        return this.next;
    }

    /**
     * Set the next Node.
     * @param next: the Node that will be the next.
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * Convert a Object for the class type of the List<T>
     * @param o: the object tha will be converted.
     * @param clazz: the class that the object wil be converted.
     * @param <T>: type of the class will be converted.
     * @return element Object converted to the type of class passed.
     */
    public static <T> T convert(Object o, Class<T> clazz) {
        try {
            return clazz.cast(o);
        } catch(ClassCastException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(data, node.data) &&
                Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }
}
