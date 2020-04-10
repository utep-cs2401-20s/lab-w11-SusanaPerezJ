import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class newSortingTester {

    @Test
    public void newSortTest1(){
        int[] arr = {6,5,4,3,2,1};
        int[] expected = {1,2,3,4,5,6};
        newSorting a = new newSorting();
        a.newSorting(arr,4);
        assertArrayEquals(expected, arr);
    }
    @Test
    public void newSortTest2(){
        int[] arr = {1,2,3,4,5,6};
        int[] expected = {1,2,3,4,5,6};
        newSorting a = new newSorting();
        a.newSorting(arr,4);
        assertArrayEquals(expected, arr);
    }
    @Test
    public void newSortTest3(){
        int[] arr = {5,2,3,4,7,1,6};
        int[] expected = {1,2,3,4,5,6,7};
        newSorting a = new newSorting();
        a.newSorting(arr,4);
        assertArrayEquals(expected, arr);
    }
    @Test
    public void newSortTest4(){
        int[] arr = {5,2,2,3,4,4};
        int[] expected = {2,2,3,4,4,5};
        newSorting a = new newSorting();
        a.newSorting(arr,4);
        assertArrayEquals(expected, arr);
    }
    @Test
    public void newSortTest5(){
        int[] arr = {-4,-8,2,4,-4,3,3};
        int[] expected = {-8,-4,-4,2,3,3,4};
        newSorting a = new newSorting();
        a.newSorting(arr,4);
        assertArrayEquals(expected, arr);
    }
}