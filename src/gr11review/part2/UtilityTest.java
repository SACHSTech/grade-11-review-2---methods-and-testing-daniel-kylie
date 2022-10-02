package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import gr11review.part2.Utility;

public class UtilityTest{
    
    // Methods 1
    @Test
    public void xyBalanceTest1(){ 
        assertEquals(true, Utility.xyBalance("xxxy"));
    } 

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

    @Test
    public void withoutTenTest3(){
        int[] intArray2 = {10, 10, 2, 2};
        int[] intArrayExpected2 = {2, 2, 0, 0};
        assertArrayEquals(intArrayExpected2, Utility.withoutTen(intArray2));
    }
  
}
