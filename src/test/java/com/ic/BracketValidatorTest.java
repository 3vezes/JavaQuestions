package com.ic;

import org.junit.Assert;
import org.junit.Test;

public class BracketValidatorTest {

    @Test
    public void testValidate() throws Exception {
        Assert.assertTrue(BracketValidator.validate("{ [ ] ( ) }"));
        Assert.assertFalse(BracketValidator.validate("{ [ ( ] ) }"));
        Assert.assertFalse(BracketValidator.validate("{ [ }" ));
    }
}
