import myDataStructures.MyQueue;
import org.junit.Assert;
import org.junit.Test;

public class TestQueue {
    MyQueue myQueue = new MyQueue();

    @Test
    public void testEnqueue() throws Exception {
        myQueue.enqueue(12);
        myQueue.enqueue(11);
        myQueue.enqueue(1);
        myQueue.enqueue(9);
        Assert.assertEquals(12, myQueue.getElement());
    }

    @Test
    public void testEmptyQueue() throws Exception {
        Assert.assertEquals(12, myQueue.getElement());
    }

    @Test
    public void testDequeue() throws Exception {
        myQueue.enqueue(12);
        myQueue.enqueue(11);
        myQueue.enqueue(1);
        myQueue.enqueue(9);
        Assert.assertEquals(12, myQueue.dequeue());
        Assert.assertEquals(11, myQueue.getElement());
    }

}
