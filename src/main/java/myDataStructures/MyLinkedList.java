package myDataStructures;

import node.Node;

import java.util.Stack;

public class MyLinkedList<L> {

    public Node<L> head;

    public boolean isListEmpty() {
        return head == null;
    }

    public void addElement(L data) {
        Node<L> nodeToAdd = new Node<>(data);
        if (isListEmpty())
            head = nodeToAdd;
        else {
            Node<L> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nodeToAdd;
        }
    }

    public void printListElements() {
        Node<L> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void printListElements(Node<L> head) {
        Node<L> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void removeData(L data) throws Exception {
        Node<L> temp = head;
        if (!isListEmpty()) {
            if (head.data == data) {
                head = null;
            } else {
                while (temp.next.data != data) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
        } else
            throw new Exception("removal from Empty list");
    }

    public void removeLastElement() throws Exception {
        Node<L> temp = head;

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

    public L getLastElement() throws Exception {
        Node<L> temp = head;

        if (!isListEmpty()) {
            if (head.next == null) {
                L headData = (L) head.data;
                head = null;
                return headData;
            } else {
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                return (L) temp.next.data;
            }
        } else
            throw new Exception("removal from Empty list");
    }

    public L removeFirst() throws Exception {
        L removedItem;
        if (!isListEmpty()) {
            if (head.next == null) {
                removedItem = (L) head.data;
                head = null;
                return removedItem;
            } else {
                removedItem = (L) head.data;
                head = head.next;
                return removedItem;
            }
        } else
            throw new Exception("removal from Empty List");
    }

    public L getFirst() throws Exception {
        if (!isListEmpty()) {
            return (L) head.data;
        } else
            throw new Exception("removal from Empty List");
    }

    public Node<L> reverse(Node<L> head) {

        Node<L> prev = null;
        Node<L> next = null;
        Node<L> current = head;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public Node<L> getMiddleElement(Node<L> head) {
        Node<L> first = head;
        Node<L> second = head;

        while ((second != null) && (second.next != null)) {
            first = first.next;
            second = second.next.next;
        }
        return first;
    }

    public boolean isPalindromeList(Node<L> head) {

        Stack<L> stack = new Stack<>();

        Node<L> temp = head;
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        Node<L> temp2 = head;
        while (temp2 != null) {
            L lastListElement = stack.pop();
            if (lastListElement != temp2.data)
                return false;
            temp2 = temp2.next;
        }
        return true;
    }

    public Node<L> arrangeOddEvenElementsInList(Node<L> head) {
        if (head == null)
            return null;

        Node<L> odd = head;
        Node<L> even = head.next;
        Node<L> evenFirst = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenFirst;

        return head;
    }
}
