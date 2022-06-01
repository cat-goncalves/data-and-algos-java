package com.algorithms;

import static java.lang.Character.isDigit;
import static java.lang.Integer.parseInt;

public class BinaryConvert {
    public static void main(String[] args){
        int number = convertFromBinary("100101");
        System.out.println("Number for binary 100101: " + number);
    }

    public static int convertFromBinary(String binary){
// return calculated decimal int converted from String binary
        int result = Integer.parseInt(binary, 2);
        return result;
    }

}
