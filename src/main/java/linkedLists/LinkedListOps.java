package linkedLists;

public class LinkedListOps {

    public Node add(Node head, int data) {
        if (head == null) {
            head = new Node(data);
            return head;
        }
        if (head.next == null) {
            head.next = new Node(data);
            return head;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
            return head;
        }
    }

    public void printList(Node head) {
        Node temp = head;
        if (head == null)
            return;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}

