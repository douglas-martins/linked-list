package br.univali.kob.model;

import java.util.Objects;

/**
 * Generic Linked List class.
 * @param <T>: type of the Node in the Linked List.
 */
public class LinkedList<T> {
    /**
     * Head of the linked list.
     */
    private Node head;

    /**
     * Insert object on the list.
     * @param data: the object that will be inserted.
     */
    public void insert(Object data) {
        Node<T> newNode = new Node<>(data);

        if (this.head == null) {
            this.head = newNode;
        } else {
            Node lastNode = this.head;

            // traverse till the last node
            // and insert the new_node there
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }

            lastNode.setNext(newNode);
        }
    }

    /**
     * Delete the linked list object with key.
     * @param key: key of the object that will be deleted.
     */
    public void deleteByKey(T key) {
        Node currentNode = this.head;
        Node previousNode = null;

        // CASE 1:
        // If head node itself holds the key to be deleted
        if (currentNode != null && currentNode.getData() == key) {
            this.head = currentNode.getNext();
            System.out.println(key + " founded and deleted.");
            return;
        }

        // CASE 2:
        // If the key is somewhere other than at head

        // Search for the key to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while (currentNode != null && currentNode.getData() != key) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }

        // If the key was present, it should be at currNode
        // Therefore the currNode shall not be null
        if (currentNode != null) {
            previousNode.setNext(currentNode.getNext());
            System.out.println(key + " founded and deleted.");
            return;
        }

        // CASE 3: The key is not present
        if (currentNode == null) {
            System.out.println(key + " not founded.");
        }
    }

    /**
     * Delete the linked list object in the position given.
     * @param index: the position of object that will be deleted.
     */
    public void deleteByIndex(int index) {
        Node currentNode = this.head;
        Node previousNode = null;

        // CASE 1:
        // If index is 0, then head node itself is to be deleted
        if (index == 0 && currentNode != null) {
            this.head = currentNode.getNext();
            System.out.println("Element on position " + index + " was deleted.");
            return;
        }

        // CASE 2:
        // If the index is greater than 0 but less than the size of LinkedList
        int counter = 0;

        // Count for the index to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while (currentNode != null) {
            if (counter == index) {
                // Since the currNode is the required position
                // Unlink currNode from linked list
                previousNode.setNext(currentNode.getNext());
                System.out.println("Element on position " + index + " was deleted.");
                break;
            } else {
                // If current position is not the index
                // continue to next node
                previousNode = currentNode;
                currentNode = currentNode.getNext();
                counter++;
            }
        }

        // If the position element was found, it should be at currNode
        // Therefore the currNode shall not be null
        //
        // CASE 3: The index is greater than the size of the LinkedList
        //
        // In this case, the currNode should be null
        if (currentNode == null) {
            System.out.println("Element on position " + index + " was not founded.");
        }
    }

    /**
     * Get the number o elements on the linked list.
     * @return int with the value of elements in the linked list
     */
    public int size() {
        Node currentNode = this.head;
        int counter = 0;

        if (isEmpty()) {
            return counter;
        }

        while (currentNode != null) {
            currentNode = currentNode.getNext();
            counter++;
        }

        return counter;
    }

    /**
     * Verify if the element contains inside the linked list
     * @param obj: the obj that will be search on the list
     * @return boolean if the obj contains return true else false
     */
    public boolean isInside(T obj) {
        Node currentNode = this.head;

        if (currentNode != null && currentNode.getData().equals(obj)) {
            return true;
        }

        while (currentNode != null) {
            if (currentNode.getData().equals(obj)) {
                return true;
            }
            currentNode = currentNode.getNext();
        }

        return false;
    }

    /**
     * Check if the linked list is empty.
     * @return boolean with the value of head linked list status.
     */
    public boolean isEmpty () {
        return this.head == null;
    }

    /**
     * Print the linked list.
     */
    public void print() {
        Node currentNode = this.head;

        System.out.print("LinkedList = [");

        while (currentNode != null) {
            System.out.print(currentNode.getData());

            if (currentNode.getNext() != null) {
                System.out.print(" -> ");
            }

            // Go to next node
            currentNode = currentNode.getNext();
            if (currentNode == null) {
                System.out.print("]");
            }
        }

        if (this.head == null) {
            System.out.print("]");
        }

        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LinkedList)) return false;
        LinkedList<?> that = (LinkedList<?>) o;
        return Objects.equals(head, that.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head);
    }
}
