package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {

    public List<Integer> intersection(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>(a.length);
        int count = 0;
        for (int x : a) {
            for (int y : b) {
                count++;
                if (x == y) result.add(x);
            }
        }
        System.out.println("Total Iterations slow: " + count);
        return result;
    }

    public List<Integer> intersectionFast(int[]a, int[]b) {
        List<Integer> retList = new ArrayList<>();
        int count = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        int aIndex = 0;
        int bIndex = 0;
        while (aIndex < a.length && bIndex < b.length){
            System.out.println("Count starts at " + count);
            count++;
            System.out.println("Count is incremented to " + count);
            System.out.println("a index: " + aIndex + "\nb index: " + bIndex);
            System.out.println("retList before" + retList);
            System.out.println(String.format("a[%s]: %s\nb[%s]: %s", aIndex, a[aIndex], bIndex, b[bIndex]));
            if (a[aIndex] == b[bIndex]) {
                retList.add(a[aIndex]);
                aIndex++;
                bIndex++;

                System.out.println("If(a[aIndex] == b[bIndex])\n index: " + aIndex + "\n b index: " + bIndex);
                System.out.println("retList inside If" + retList);
            }
            else if (a[aIndex] < b[bIndex]) {
                aIndex++;
                System.out.println("a <b\na index: " + aIndex + "\n b index: " + bIndex);
                System.out.println("a <b\nretList after" + retList);
            }
            else {
                bIndex++;
                System.out.println("b < a\na index: " + aIndex + "\n b index: " + bIndex);
                System.out.println("b < a\nretList after" + retList);
            }
        }
        System.out.println("Total Iterations fast: " + count);
        return retList;
    }

    public static void main(String args[]) {
        Intersection simpleIntersection = new Intersection();
        System.out.println(simpleIntersection.intersection(new int[]{4, 7, 5, 2, 3}, new int[]{4, 2, 3, 9, 1}));
        int[] numbers1 = new int[]{66, 24, 75, 22, 12, 87};
        int[] numbers2 = new int[]{32, 41, 98, 66, 39, 24};

        List<Integer> result = new Intersection().intersectionFast(numbers1, numbers2);
        System.out.println(result);

    }
}
