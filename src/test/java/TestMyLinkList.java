import myDataStructures.MyLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class TestMyLinkList {

    MyLinkedList myLinkedList = new MyLinkedList();

    @Test
    public void testListAdd() {
        myLinkedList.addElement(2);
        myLinkedList.addElement(5);
        myLinkedList.addElement(7);
        myLinkedList.addElement(8);
        myLinkedList.printListElements();
    }

    @Test
    public void removeListElement() {
        myLinkedList.addElement(2);
        myLinkedList.addElement(5);
        myLinkedList.addElement(7);
        myLinkedList.addElement(8);
        myLinkedList.removeData(7);
        myLinkedList.printListElements();
    }

    @Test
    public void removeHead() {
        myLinkedList.addElement(7);
        myLinkedList.removeData(7);
        Assert.assertTrue(myLinkedList.isListEmpty());
    }

}