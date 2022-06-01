package com.algorithms;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryConvertTest {

    @Test
    public void convertFromOctalStringToDecimalValue() {
        Assert.assertEquals(2000, BinaryConvert.convertFromOctalStringToDecimalValue("3720"));
    }
}