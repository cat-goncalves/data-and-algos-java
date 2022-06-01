package com.algorithms;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryConvertTest {

    @Test
    public void convertFromBinary_should_reeturn_valid_decimal_value_given_valid_binary_string() {
//        int decimalResult = BinaryConvert.convertFromBinary("10010");
//        Assert.assertEquals(10, decimalResult);
//        int decimalResult = BinaryConvert.convertFromBinary("10010");
//        Assert.assertEquals(10, decimalResult);

        String[] testBinaryStringArray = {};
        int[] expectedDecimalValueArray = {};

        for(int i = 0; i < testBinaryStringArray.length; i++) {
            int resultDecimalValue = BinaryConvert.convertFromBinary(testBinaryStringArray[i]);
            Assert.assertEquals(expectedDecimalValueArray[i], resultDecimalValue);
        }
    }
}