package org.pptel.datastructure.linkedList;

public class LinkedListClient {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(4);
        list.insert(6);
        list.insert(1);
        list.insert(8);
        list.insert(6);
        list.insert(9);
        list.insert(5);
        list.display();

        list.addAtFirst(11);
        list.display();

        list.find(8);
        list.find(12);

        list.delete(5);
        list.display();

        list.delete(8);
        list.display();

        list.delete(12);
        list.display();

        list.delete(11);
        list.display();

        list.clear();
        list.insert(4);
        list.delete(4);
        list.display();

    }
}
