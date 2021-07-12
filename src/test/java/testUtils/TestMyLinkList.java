package testUtils;

import myDataStructures.MyLinkedList;
import node.Node;
import org.junit.Assert;
import org.junit.Test;

public class TestMyLinkList {

    MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

    @Test
    public void testListAdd() {
        myLinkedList.addElement(2);
        myLinkedList.addElement(5);
        myLinkedList.addElement(7);
        myLinkedList.addElement(8);
        myLinkedList.printListElements();
    }

    @Test
    public void removeListElement() throws Exception {
        myLinkedList.addElement(2);
        myLinkedList.addElement(5);
        myLinkedList.addElement(7);
        myLinkedList.addElement(8);
        myLinkedList.removeData(7);
        myLinkedList.printListElements();
    }

    @Test
    public void removeHead() throws Exception {
        myLinkedList.addElement(7);
        myLinkedList.removeData(7);
        Assert.assertTrue(myLinkedList.isListEmpty());
    }

    @Test
    public void removeLast() throws Exception {
        myLinkedList.addElement(7);
        myLinkedList.removeLastElement();
        Assert.assertTrue(myLinkedList.isListEmpty());
    }

    @Test
    public void reverseTest() throws Exception {
        myLinkedList.addElement(2);
        myLinkedList.addElement(5);
        myLinkedList.addElement(7);
        myLinkedList.addElement(8);
        myLinkedList.printListElements();
        Node<Integer> reverseList = myLinkedList.reverse(myLinkedList.head);
        System.out.println("\n");
        myLinkedList.printListElements(reverseList);
    }

    @Test
    public void testMiddleNode() {
        myLinkedList.addElement(2);
        myLinkedList.addElement(5);
        myLinkedList.addElement(7);
        myLinkedList.addElement(8);
        Node<Integer> getMiddle = myLinkedList.getMiddleElement(myLinkedList.head);
        myLinkedList.printListElements(getMiddle);
    }

    @Test
    public void testPalindromeList() {
        myLinkedList.addElement(1);
        myLinkedList.addElement(2);
        myLinkedList.addElement(2);
        myLinkedList.addElement(2);
        myLinkedList.printListElements();
        System.out.println(myLinkedList.isPalindromeList(myLinkedList.head));
    }

    @Test
    public void testOddEvenList() {
        myLinkedList.addElement(10);
        myLinkedList.addElement(20);
        myLinkedList.addElement(30);
        myLinkedList.addElement(40);
        myLinkedList.arrangeOddEvenElementsInList(myLinkedList.head);
        myLinkedList.printListElements();
    }
}