import myDataStructures.MyStack;
import org.junit.Assert;
import org.junit.Test;

public class TestMyStack {

    MyStack myStack = new MyStack();

    @Test
    public void testPushToStack() throws Exception {
        myStack.pushToStack(11);
        myStack.pushToStack(12);
        myStack.pushToStack(1);
        Assert.assertEquals(1, myStack.peek());
    }

    @Test
    public void testPopFromStack() throws Exception {
        myStack.pushToStack(11);
        myStack.pushToStack(12);
        myStack.pushToStack(1);
        myStack.popFromStack();
        Assert.assertEquals(12, myStack.peek());
    }

}
