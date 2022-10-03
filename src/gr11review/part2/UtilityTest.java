package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import gr11review.part2.Utility;

import java.util.Arrays;;

public class UtilityTest{
    
    // Methods 1
    @Test
    public void xyBalanceTest1(){ 
        assertEquals(true, Utility.xyBalance("xxxy"));
    } 

    // Tests when numbers are involved
    @Test
    public void xyBalanceTest2(){
        assertEquals(false, Utility.xyBalance("xyxxewe23"));
    }

    @Test
    public void xyBalanceTest3(){
        assertEquals(true, Utility.xyBalance("xxxy2189das"));
    }

    // IO reader 1
    @Test
    public void longestWordTest1(){
        try{
            assertEquals("consectetur", Utility.longestWord("words.txt"));
        }catch(IOException e){       
            System.out.println("File does not exist.");     
        }
    }
    
    // Tests when numbers are involved
    @Test
    public void longestWordTest2(){
        try{
            assertEquals("dasduio1212321332432", Utility.longestWord("words2.txt"));
        }catch(IOException e){       
            System.out.println("File does not exist.");     
        }
    } 

    // Array 1 - One Dimensional 
    @Test 
    public void withoutTenTest1(){
        int[] intArray = {1, 10, 10, 2};
        int[] intArrayExpected = {1, 2, 0, 0};
        assertArrayEquals(intArrayExpected, Utility.withoutTen(intArray));
    }

    @Test
    public void withoutTenTest2(){
        int[] intArray1 = {1, 99, 2, 2, 3, 10, 10, 10};
        int[] intArrayExpected1 = {1, 99, 2, 2, 3, 0, 0, 0};
        assertArrayEquals(intArrayExpected1, Utility.withoutTen(intArray1));
    }

    // Tests when empty
    @Test
    public void withoutTenTest3(){
        int[] intArray2 = {};
        int[] intArrayExpected2 = {};
        assertArrayEquals(intArrayExpected2, Utility.withoutTen(intArray2));
    }

    // Array 4 - One Dimensional - Two Loops
    // False case
    @Test
    public void linearInTest1(){
        int[] intOuter = {10, 10, 20, 30, 40};
        int[] intInner = {10, 11};
        assertEquals(false, Utility.linearIn(intOuter, intInner) );
    }

    // True case
    @Test
    public void linearInTest2(){
        int[] intOuter1 = {1, 2, 4, 6};
        int[] intInner1 = {2, 4};
        assertEquals(true, Utility.linearIn(intOuter1, intInner1) );
    }
    
    // Array 7 - Two Dimensional
    @Test
    public void reverseTest1() {
        int[][] intTwoDArray = new int[][]{{6, 5 ,4}, {3, 2, 1}};
        int[][] intReverseArray = new int[][]{{1, 2, 3}, {4, 5, 6}};
        assertTrue(Arrays.deepEquals(intTwoDArray, Utility.reverse(intReverseArray)));
    }

    // Checks that it works with 3 by 3 case
    @Test
    public void reverseTest2() {
        int[][] intTwoDArray1 = new int[][]{{9, 8, 7}, {6, 5 ,4}, {3, 2, 1}};
        int[][] intReverseArray1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertTrue(Arrays.deepEquals(intTwoDArray1, Utility.reverse(intReverseArray1)));
    }

    // Checks that it works with 2 by 4 case
    @Test
    public void reverseTest3() {
        int[][] intTwoDArray2 = new int[][]{{7, 6, 5, 4}, {3, 2, 1, 0}};
        int[][] intReverseArray2 = new int[][]{{0, 1, 2, 3}, {4, 5, 6, 7}};
        assertTrue(Arrays.deepEquals(intTwoDArray2, Utility.reverse(intReverseArray2)));
    }
}
