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

    public void removeData(int data) throws Exception {
        Node temp = head;
        if (head.data == data) {
            head = null;
        }
        if (!isListEmpty()) {
            while (temp.next.data != data) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        } else
            throw new Exception("removal from Empty list");
    }

    public void removeLastElement() throws Exception {
        Node temp = head;

        if (!isListEmpty()) {
            if (head.next == null) {
                head = null;
            } else {
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
            }
        } else
            throw new Exception("removal from Empty list");
    }

    public int getLastElement() throws Exception {
        Node temp = head;

        if (!isListEmpty()) {
            if (head.next == null) {
                int headData = head.data;
                head = null;
                return headData;
            } else {
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                return temp.next.data;
            }
        } else
            throw new Exception("removal from Empty list");
    }
}
