package org.pptel.datastructure.linkedList;


public class LinkedList<T> {
    Node<T> first;

    public void addAtFirst(T data) {
        Node<T> node = new Node<>(data);
        node.setNext(first);
        first = node;
    }

    public void insert(T data) {
        System.out.println(" inserting data " + data);
        Node<T> node = new Node<>(data);
        if (first == null) {
            first = node;
        } else {
            Node current = first;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }

    }

    public void display() {
        Node current = first;
        while (current != null) {
            System.out.println(" Data - > " + current.getData());
            current = current.getNext();
        }
        System.out.println(" ******* END ********");
    }

    public T find(T data) {
        Node current = first;
        while (current != null) {
            if (current.getData().equals(data)) {
                System.out.println(" Data found: " + data);
                return data;
            }
            current = current.getNext();
        }
        System.out.println(" Data not found:  " + data);
        return null;
    }

    public void delete(T data) {
        Node current = first;
        boolean isDeleted = false;
        if (current.getData().equals(data)) {
          if(first.getNext()!=null){
              first=first.getNext();
          }else {
              first=null;
          }
            isDeleted =true;
        }else {
            while (current.getNext() != null) {
                if (current.getNext().getData().equals(data)) {
                    current.setNext(current.getNext().getNext());
                    isDeleted=true;
                    break;
                }
                current = current.getNext();
            }


        }

        if(isDeleted){
            System.out.println("going to delete " + data);
        }else {
            System.out.println("data not found to delete " + data);

        }
    }

    public void clear() {
        first=null;
    }


}
