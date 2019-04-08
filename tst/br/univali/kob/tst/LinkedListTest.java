package br.univali.kob.tst;

import br.univali.kob.model.LinkedList;

public class LinkedListTest {
    private LinkedList<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        LinkedListTest linkedListTest = new LinkedListTest();


        linkedListTest.insertTest();

        System.out.println();
        System.out.println();

        linkedListTest.deleteByKeyTest();

        System.out.println();
        System.out.println();

        linkedListTest.deleteByIndexTest();

        System.out.println();
        System.out.println();

        linkedListTest.sizeTest();

        System.out.println();
        System.out.println();

        linkedListTest.insideTest();

        System.out.println();
        System.out.println();

        linkedListTest.emptyTest();

    }

    private void insertTest() {
        System.out.println("########## INSERT TEST ##########");
        for (int i = 1; i < 9; i++) {
            this.linkedList.insert(i);
        }

        this.linkedList.print();

        System.out.println("########## INSERT TEST ##########");
    }

    private void deleteByKeyTest() {
        System.out.println("########## DELETE BY KEY TEST ##########");
        // Delete node with value 1
        // In this case the key is ***at head***
        this.linkedList.deleteByKey(1);

        this.linkedList.print();

        // Delete node with value 4
        // In this case the key is present ***in the middle***
        this.linkedList.deleteByKey(4);

        this.linkedList.print();

        // Delete node with value 10
        // In this case the key is ***not present***
        this.linkedList.deleteByKey(10);

        this.linkedList.print();

        System.out.println("########## DELETE BY KEY TEST ##########");
    }

    private void deleteByIndexTest() {
        System.out.println("########## DELETE BY INDEX TEST ##########");

        // Delete node at position 0
        // In this case the key is ***at head***
        this.linkedList.deleteByIndex(0);

        this.linkedList.print();

        // Delete node at position 2
        // In this case the key is present ***in the middle***
        this.linkedList.deleteByIndex(2);

        this.linkedList.print();

        // Delete node at position 10
        // In this case the key is ***not present***
        this.linkedList.deleteByIndex(10);

        this.linkedList.print();

        System.out.println("########## DELETE BY INDEX TEST ##########");
    }

    private void sizeTest() {
        System.out.println("########## LIST SIZE TEST ##########");

        System.out.println("Number of elements in the list is: " + this.linkedList.size());
        this.linkedList.print();

        System.out.println("########## LIST SIZE TEST ##########");
    }

    private void insideTest() {
        System.out.println("########## VERIFY IF ELEMENT IS INSIDE TEST ##########");

        System.out.println("The element 4 is inside list? " + this.linkedList.isInside(4));
        this.linkedList.print();

        System.out.println("The element 8 is inside list? " + this.linkedList.isInside(8));
        this.linkedList.print();

        System.out.println("########## VERIFY IF ELEMENT IS INSIDE TEST ##########");
    }

    private void emptyTest() {
        System.out.println("########## VERIFY IF LIST IS EMPTY TEST ##########");

        System.out.println("The list is empty? " + this.linkedList.isEmpty());
        this.linkedList.print();

        LinkedList<Integer> emptyList = new LinkedList<>();
        System.out.println("The list empty? (** new empty list **) " + emptyList.isEmpty());
        emptyList.print();

        System.out.println("########## VERIFY IF LIST IS EMPTY TEST ##########");
    }
}
