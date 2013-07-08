import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class DrawLineTest {

    public static final byte[] TEST_DATA = {0,0,0,0,
                                            0,0,0,0,
                                            0,0,0,0,
                                            0,0,0,0};

    public static final byte[] EXPECTED_DATA = {0,0,0,0,
                                                0,0,0,0,
                                                127,127,127,127,
                                                0,0,0,0};

    @Test
    public void testDrawHorizontalLine() throws Exception {
        byte[] results = DrawLine.drawHorizontalLine(TEST_DATA,4,0,3,2);
        Assert.assertArrayEquals(EXPECTED_DATA,results);
    }
}
