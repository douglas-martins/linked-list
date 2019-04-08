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

        linkedListTest.deleteByIndex();


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
        this.linkedList.delete(new Integer(1));

        this.linkedList.print();

        // Delete node with value 4
        // In this case the key is present ***in the middle***
        this.linkedList.delete(new Integer(4));

        this.linkedList.print();

        // Delete node with value 10
        // In this case the key is ***not present***
        this.linkedList.delete(new Integer(10));

        this.linkedList.print();

        System.out.println("########## DELETE BY KEY TEST ##########");
    }

    private void deleteByIndex() {
        System.out.println("########## DELETE BY INDEX TEST ##########");

        //
        // ******DELETION AT POSITION******
        //

        // Delete node at position 0
        // In this case the key is ***at head***
        this.linkedList.delete(0);

        this.linkedList.print();

        // Delete node at position 2
        // In this case the key is present ***in the middle***
        this.linkedList.delete(2);

        this.linkedList.print();

        // Delete node at position 10
        // In this case the key is ***not present***
        this.linkedList.delete(10);

        this.linkedList.print();

        System.out.println("########## DELETE BY INDEX TEST ##########");
    }
}
