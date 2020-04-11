import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class newSortingTester {

    /*TEST 1
     *INPUT: {6,5,4,3,2,1}
     * EXPECTED OUTPUT = {1,2,3,4,5,6}
     * ACTUAL OUTPUT = {1,2,3,4,5,6}
     *
     * Testing with a decreasingly sorted array. this will check if the quickSort method sorts the halves of the original array correctly */
    @Test
    public void newSortTest1(){
        int[] arr = {6,5,4,3,2,1};
        int[] expected = {1,2,3,4,5,6};
        newSorting a = new newSorting();
        a.newSorting(arr,4);
        assertArrayEquals(expected, arr);
    }
    /*TEST 2
     *INPUT: {1,2,3,4,5,6} with a size of 2
     * EXPECTED OUTPUT = {1,2,3,4,5,6}
     * ACTUAL OUTPUT = {1,2,3,4,5,6}
     *
     * Testing with an already sorted array to check that the partitionArray (helper method of quicksort) checks the elements of the array and does not swap them if they
     * are in the correct increasing order.*/
    @Test
    public void newSortTest2(){
        int[] arr = {1,2,3,4,5,6};
        int[] expected = {1,2,3,4,5,6};
        newSorting a = new newSorting();
        a.newSorting(arr,2);
        assertArrayEquals(expected, arr);
    }
    /*TEST 3
     *INPUT: {5,2,3,4,7,1,6} with a size of 7 (the number of elements in the array)
     * EXPECTED OUTPUT = {1,2,3,4,5,6,7}
     * ACTUAL OUTPUT = {1,2,3,4,5,6,7}
     *
     * This test checks if the newSort method returns the expected array with an input of odd length. This also checks that the partition in half works properly */
    @Test
    public void newSortTest3(){
        int[] arr = {5,2,3,4,7,1,6};
        int[] expected = {1,2,3,4,5,6,7};
        newSorting a = new newSorting();
        a.newSorting(arr,7);
        assertArrayEquals(expected, arr);
    }
    /*TEST 4
     *INPUT: {5,2,2,3,4,4} with a size of 1
     * EXPECTED OUTPUT = {2,2,3,4,4,5}
     * ACTUAL OUTPUT = {2,2,3,4,4,5}
     *
     * Test with an input that has duplicated elements. This checks that the conditions in partitionArray work and that even with more than one of the same
     * element, the sorting will still work*/
    @Test
    public void newSortTest4(){
        int[] arr = {5,2,2,3,4,4};
        int[] expected = {2,2,3,4,4,5};
        newSorting a = new newSorting();
        a.newSorting(arr,1);
        assertArrayEquals(expected, arr);
    }
    /*TEST 5
     *INPUT: {-4,-8,2,4,-4,3,3} with a size of 5
     * EXPECTED OUTPUT = {-8,-4,-4,2,3,3,4}
     * ACTUAL OUTPUT = {-8,-4,-4,2,3,3,4}
     *
     * Test with an input that has negative integers. This checks that the conditions in quickSort work properly and that the mergeSortedHalves puts the elements
     * in the right order on the final array*/
    @Test
    public void newSortTest5(){
        int[] arr = {-4,-8,2,4,-4,3,3};
        int[] expected = {-8,-4,-4,2,3,3,4};
        newSorting a = new newSorting();
        a.newSorting(arr,5);
        assertArrayEquals(expected, arr);
    }
}