package com.algorithms;

import org.junit.Test;

public class BinaryConvertTest {
    String[] testBinaryStringArray ={"11111010000", "101010001", "1100", "10010000", "110010", "1010111110"};
    String[] testOctalStringArray = {"3720", "337", "12", "144", "50", "702"};
    int[] incorrectDecimalValueArray = {2001, 224, 11, 101, 41, 451};

    @Test(expected = MyNumberFormatException.class)
    public void convertFromBinaryTest_should_return_decimal_value_given_valid_binary_string() {
        BinaryConvert.convertFromBinary("1100a");
    }

    @Test(expected = MyNumberFormatException.class)
    public void convertFromOctalTest_should_throw_MyNumberFormatException_given_invalid_octal_string() {
        BinaryConvert.convertFromOctal("17a");
    }
}