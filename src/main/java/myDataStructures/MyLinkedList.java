package myDataStructures;

import node.Node;

public class MyLinkedList {

    Node head;

    public boolean isListEmpty() {
        return head == null;
    }

    public void addElement(int data) {
        Node nodeToAdd = new Node(data);
        if (isListEmpty())
            head = nodeToAdd;
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nodeToAdd;
        }
    }

    public void printListElements() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void removeData(int data) {
        Node temp = head;
        if (head.data == data) {
            head = null;
        }
        if (!isListEmpty()) {
            while (temp.next.data != data) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }


}
