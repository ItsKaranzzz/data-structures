package myDataStructures;

public class MyQueue<Q> {

    MyLinkedList<Q> list = new MyLinkedList<>();

    public void enqueue(Q data) {
        list.addElement(data);
    }

    public Q dequeue() throws Exception {
        return list.removeFirst();
    }

    public Q getElement() throws Exception {
        return list.getFirst();
    }
}
