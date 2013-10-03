package test.java.com.cci;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class ModifiedStackTest {

    ModifiedStack stack;
    Random random;

    @Before
    public void setUp() throws Exception {
        stack = new ModifiedStack();
        random = new Random(System.currentTimeMillis());
    }

    @Test
    public void testMin() throws Exception {
        //Throw in some random data.
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < 50000; i++){
            int temp = random.nextInt();
            if(temp < smallest){
                smallest = temp;
            }
            stack.push(temp);
        }

        Assert.assertTrue(smallest == stack.min());
    }

    @Test
    public void testMinDup() throws Exception {
        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(2);

        Assert.assertTrue(stack.min() == 2);
        stack.pop(); //Pop 2
        stack.pop(); //Pop 3
        Assert.assertTrue(stack.min() == 2);
        stack.pop(); //Pop 2
        Assert.assertTrue(stack.min() == 5);
    }
}
