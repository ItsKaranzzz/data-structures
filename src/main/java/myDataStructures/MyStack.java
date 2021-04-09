package myDataStructures;

import node.Node;

public class MyStack<S> {

    MyLinkedList<S> list = new MyLinkedList<>();
    Node top;

    public void pushToStack(S data) {
        list.addElement(data);
    }

    public void popFromStack() throws Exception {
        if (!isStackEmpty())
            list.removeLastElement();
        else
            throw new Exception("pop from an empty stack");
    }

    public boolean isStackEmpty() {
        return list.isListEmpty();
    }

    public S peek() throws Exception {
        if (!isStackEmpty())
            return list.getLastElement();
        else
            throw new Exception("peek from an empty stack");

    }
}
