package gr11review.part2;
import java.io.IOException;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import gr11review.part2.Utility;

import java.util.Arrays;;

public class UtilityTest{

    // test Method - 3
    @Test
    public void xyzMiddleTest1(){
        assertEquals(true, Utility.xyzMiddle("AAxyzBB"));
    }
    @Test
    public void xyzMiddleTest2(){
        assertEquals(true, Utility.xyzMiddle("AxyzBB"));
    }
    @Test
    public void xyzMiddleTest3(){
        assertEquals(false, Utility.xyzMiddle("AxyzBBB"));
    }
    

    // test File IO - Read 2
    @Test
    public void alphaWordTest1() {
        try{
            assertEquals("adipiscing", Utility.alphaWord("words.txt"));


    /**
     * Methods 1 - Test that there is a y behind all x's
     * @author D.Gu
     */
    @Test
    public void xyBalanceTest1(){ 
        assertEquals(true, Utility.xyBalance("xxxy"));
    } 
    
    /**
     * Test when numbers are involved
     * @author D.Gu
     */
    @Test
    public void xyBalanceTest2(){
        assertEquals(false, Utility.xyBalance("xyxxewe23"));
    }
    
    /**
     * Test when there are characters other than x behind y
     * @author D.Gu
     */
    @Test
    public void xyBalanceTest3(){
        assertEquals(true, Utility.xyBalance("xxxy2189das"));
    }

    /**
     * IO Reader 1 - Tests for the longest word on a line in a txt file
     * @author D.Gu
     */
    @Test
    public void longestWordTest1(){
        try{
            assertEquals("consectetur", Utility.longestWord("words.txt"));
        }catch(IOException e){       
            System.out.println("File does not exist.");     
        }
    }
    

    // test Arrays 3 - One Dimensional
    @Test
    public void zeroFrontTest1(){
        int[] intZeroArray1 = {1, 0, 0, 1};
        int[] intReturnArray1 = {0, 0, 1, 1};
        assertArrayEquals(intReturnArray1, Utility.zeroFront(intZeroArray1));
    }
    @Test
    public void zeroFrontTest2(){
        int[] intZeroArray2 = {0, 1, 1, 0, 1};
        int[] intReturnArray2 = {0, 0, 1, 1, 1};
        assertArrayEquals(intReturnArray2, Utility.zeroFront(intZeroArray2));
    }
    @Test
    public void zeroFrontTest3(){
        int[] intZeroArray3 = {1, 0};
        int[] intReturnArray3 = {0, 1};
        assertArrayEquals(intReturnArray3, Utility.zeroFront(intZeroArray3));
    }

    // test Array 5 - 1D - 2 loop
    @Test
    public void canBalanceTest1(){
        int[] intBalanceArray1 = {1, 1, 1, 2, 1};
        assertTrue(Utility.canBalance(intBalanceArray1));
    }
    @Test
    public void canBalanceTest2(){
        int[] intBalanceArray2 = {2, 1, 1, 2, 1};
        assertFalse(Utility.canBalance(intBalanceArray2));
    }
    @Test
    public void canBalanceTest3(){
        int[] intBalanceArray3 = {10, 10};
        assertTrue(Utility.canBalance(intBalanceArray3));
    }

    // test - Arrays 2D

    // Tests when numbers are involved

    /**
     * Test when numbers are involved
     * @author D.Gu
     */

    @Test
    public void longestWordTest2(){
        try{
            assertEquals("dasduio1212321332432", Utility.longestWord("words2.txt"));
        }catch(IOException e){       
            System.out.println("File does not exist.");     
        }
    } 

    /**
     * Array 1 - Tests to see if all 10s are removed and replaced with 0s 
     * @author D.Gu
     */
    @Test 
    public void withoutTenTest1(){
        int[] intArray = {1, 10, 10, 2};
        int[] intArrayExpected = {1, 2, 0, 0};
        assertArrayEquals(intArrayExpected, Utility.withoutTen(intArray));
    }
    
    /**
     * Test with more numbers
     * @author D.Gu
     */
    @Test
    public void withoutTenTest2(){
        int[] intArray1 = {1, 99, 2, 2, 3, 10, 10, 10};
        int[] intArrayExpected1 = {1, 99, 2, 2, 3, 0, 0, 0};
        assertArrayEquals(intArrayExpected1, Utility.withoutTen(intArray1));
    }
    
    /**
     * Test when array is empty
     * @author D.Gu
     */
    @Test
    public void withoutTenTest3(){
        int[] intArray2 = {};
        int[] intArrayExpected2 = {};
        assertArrayEquals(intArrayExpected2, Utility.withoutTen(intArray2));
    }
    
    /**
     * Array 4 - Tests if all inner array integers appear in outer array 
     * @author D.Gu
     */
    @Test
    public void linearInTest1(){
        int[] intOuter = {10, 10, 20, 30, 40};
        int[] intInner = {10, 11};
        assertEquals(false, Utility.linearIn(intOuter, intInner) );
    }

    /**
     * Test to confirm that the integers can be at different indexes in inner and outer arrays
     * @author D.Gu
     */
    @Test
    public void linearInTest2(){
        int[] intOuter1 = {1, 2, 4, 6};
        int[] intInner1 = {2, 4};
        assertEquals(true, Utility.linearIn(intOuter1, intInner1) );
    }
    
    /**
     * Array 7 - Tests to see if 2D array is reversed
     * @author D.Gu
     */
    @Test
    public void reverseTest1() {
        int[][] intTwoDArray = new int[][]{{6, 5 ,4}, {3, 2, 1}};
        int[][] intReverseArray = new int[][]{{1, 2, 3}, {4, 5, 6}};
        assertTrue(Arrays.deepEquals(intTwoDArray, Utility.reverse(intReverseArray)));
    }
    
    /**
     * Checks that it works with 3 by 3 case
     * @author D.Gu
     */
    @Test
    public void reverseTest2() {
        int[][] intTwoDArray1 = new int[][]{{9, 8, 7}, {6, 5 ,4}, {3, 2, 1}};
        int[][] intReverseArray1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertTrue(Arrays.deepEquals(intTwoDArray1, Utility.reverse(intReverseArray1)));
    }
    
    /**
     * Checks that it works with 2 by 4 case
     * @author D.Gu
     */
    @Test
    public void reverseTest3() {
        int[][] intTwoDArray2 = new int[][]{{7, 6, 5, 4}, {3, 2, 1, 0}};
        int[][] intReverseArray2 = new int[][]{{0, 1, 2, 3}, {4, 5, 6, 7}};
        assertTrue(Arrays.deepEquals(intTwoDArray2, Utility.reverse(intReverseArray2)));
    }
    
}
