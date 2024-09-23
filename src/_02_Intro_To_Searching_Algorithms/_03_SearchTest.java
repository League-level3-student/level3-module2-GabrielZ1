package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class _03_SearchTest {
    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	assertEquals(_01_LinearSearch.linearSearch(new String[] {"a", "b", "c"}, "b"), 1);
    	assertEquals(_01_LinearSearch.linearSearch(new String[] {"1", "2", "3", "4", "5"}, "4"), 3);
    	assertEquals(_01_LinearSearch.linearSearch(new String[] {"z", "y", "x", "w"}, "z"), 0);
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	assertEquals(_02_BinarySearch.binarySearch(new int[] {1, 2, 3, 4, 5, 6, 7}, 0, 6, 2), 1);
    	assertEquals(_02_BinarySearch.binarySearch(new int[] {5, 7, 29, 45, 56, 90, 103, 105}, 0, 7, 105), 7);
    	assertEquals(_02_BinarySearch.binarySearch(new int[] {6, 8, 10, 14}, 0, 3, 6), 0);
    	
    	
    }
}
