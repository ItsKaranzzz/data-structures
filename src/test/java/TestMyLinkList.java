import myDataStructures.MyLinkedList;
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

}