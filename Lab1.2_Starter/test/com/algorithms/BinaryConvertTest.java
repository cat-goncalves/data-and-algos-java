package com.algorithms;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryConvertTest {

    @Test
    public void convertFromOctal_should_return_valid_decimal_value_given_valid_octal_string() {

        String[] testOctalStringArray = {"3720", "337", "12", "144", "50", "702"};
        int[] expectedDecimalValueArray = {2000, 223, 10, 100, 40, 450};

        Assert.assertEquals(2000, BinaryConvert.convertFromOctal(testOctalStringArray[0]));

        for(int i = 0; i < testOctalStringArray.length; i++) {
            int resultDecimalValue = BinaryConvert.convertFromOctal(testOctalStringArray[i]);
            Assert.assertEquals(expectedDecimalValueArray[i], resultDecimalValue);
        }

    }
}