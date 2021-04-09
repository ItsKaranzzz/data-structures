package myDataStructures;

public class MyQueue {

    MyLinkedList list = new MyLinkedList();

    public void enqueue(int data) {
        list.addElement(data);
    }

    public int dequeue() throws Exception {
        return list.removeFirst();
    }

    public int getElement() throws Exception {
        return list.getFirst();
    }
}
