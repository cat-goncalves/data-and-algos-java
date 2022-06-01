package com.algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class IntersectionTest {

    @Test
    public void intersectionFastTest_should_return_nonEmpty_sorted_retArray() {
        int[] array1 = {5, 4, 3, 2, 1};
        int[] array2 = {2, 8, 4, 6};

        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(2,4));
//        expected.add(2);
//        expected.add(4);
        List<Integer> actual = new Intersection().intersectionFast(array1, array2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void intersectionFastTest_should_return_nonEmpty_sorted_retArray_with_duplicates() {
        int[] array1 = {66, 24, 75};
        int[] array2 = {66, 24, 66};

        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(24, 66));
        List<Integer> actual = new Intersection().intersectionFast(array1, array2);
        Assert.assertEquals(expected, actual);

    }


    @Test
    public void intersectionFastTest_should_return_empty_retArray() {
        int[] array1 = {5, 4, 3, 2, 1};
        int[] array2 = {15, 66, 80};

        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = new Intersection().intersectionFast(array1, array2);
        Assert.assertEquals(expected, actual);

    }

//    @Test
//    public void intersectionFastTest_negative_testing() {
//        int[] array1 = {5, 4, 3, 2, 1};
//        int[] array2 = {2, 8, 4, 6};
//    }

}