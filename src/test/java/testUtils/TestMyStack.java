package testUtils;

import myDataStructures.MyStack;
import org.junit.Assert;
import org.junit.Test;

public class TestMyStack {

    MyStack<String> myStack = new MyStack<>();

    @Test
    public void testPushToStack() throws Exception {
        myStack.pushToStack("Raj");
        myStack.pushToStack("Veronica");
        myStack.pushToStack("Nancy");
        Assert.assertEquals("Nancy", myStack.peek());
    }

    @Test
    public void testPopFromStack() throws Exception {
        myStack.pushToStack("Raj");
        myStack.pushToStack("Veronica");
        myStack.pushToStack("Nancy");
        myStack.popFromStack();
        Assert.assertEquals("Veronica", myStack.peek());
    }

}
