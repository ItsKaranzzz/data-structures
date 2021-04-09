import myDataStructures.MyQueue;
import org.junit.Assert;
import org.junit.Test;

public class TestQueue {
    MyQueue<String> myQueue = new MyQueue<>();

    @Test
    public void testEnqueue() throws Exception {
        myQueue.enqueue("a");
        myQueue.enqueue("q");
        myQueue.enqueue("w");
        myQueue.enqueue("t");
        Assert.assertEquals("a", myQueue.getElement());
    }

    @Test
    public void testEmptyQueue() throws Exception {
        Assert.assertEquals("a", myQueue.getElement());
    }

    @Test
    public void testDequeue() throws Exception {
        myQueue.enqueue("a");
        myQueue.enqueue("q");
        myQueue.enqueue("w");
        myQueue.enqueue("t");
        Assert.assertEquals("a", myQueue.dequeue());
        Assert.assertEquals("q", myQueue.getElement());
    }

}
