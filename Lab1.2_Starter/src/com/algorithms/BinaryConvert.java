package com.algorithms;

import static java.lang.Character.isDigit;

public class BinaryConvert {

    public static final int OCTAL_NUMBER_BASE = 8;

    public static void main(String[] args){
        int number = convertFromBinary("100101");
        System.out.println("Number for binary 100101: " + number);
        number = convertFromOctal("17");
        System.out.println("Number for octal 17: " + number);
    }

    public static int convertFromBinary(String binary){
        int conversion = 1;
        int result = 0;
/*        for (int i = 1; i <= binary.length(); i++) {
            if (binary.charAt(binary.length() - i) == '1')
                result += conversion;
            conversion *= 2;
        }
        */
// I prefer this...decrement from last element
        for (int i = binary.length()-1; i>=0; i-- ){
            System.out.println("i is " + i);
            if (binary.charAt(i) == '1'){
                System.out.println("result before is " + result);
                System.out.println("conversion before is " + conversion);
                result += conversion;
                System.out.println("result after is " + result);
            }
            conversion *= 2;
            System.out.println("conversion after *= is " + conversion);
        }
        return result;
    }

    public static int convertFromOctal(String octal) {
// implement here, return decimal int converted from octal String
        // int result = Integer.parseInt(octal, 8);
        int conversion = 1;
        int result = 0;

        for(int i = octal.length() -1; i >=0; i--) {
            System.out.println("i is " + i);
            int num = Integer.parseInt(Character.toString(octal.charAt(i)));
            result += num * conversion;
            conversion *= OCTAL_NUMBER_BASE;
        }
        return result;
    }


}
