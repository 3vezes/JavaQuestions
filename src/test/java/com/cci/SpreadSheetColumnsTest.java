package test.java.com.cci;

import org.junit.Assert;
import org.junit.Test;

public class SpreadSheetColumnsTest {

    @Test
    public void testExamplesGiven() throws Exception {
        Assert.assertEquals(SpreadSheetColumns.convertToColumn(0),"A");
        Assert.assertEquals(SpreadSheetColumns.convertToColumn(1),"B");
        Assert.assertEquals(SpreadSheetColumns.convertToColumn(26),"AA");
        Assert.assertEquals(SpreadSheetColumns.convertToColumn(27),"AB");
        Assert.assertEquals(SpreadSheetColumns.convertToColumn(702),"AAA");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegative() throws Exception {
        SpreadSheetColumns.convertToColumn(-1);

    }

}
