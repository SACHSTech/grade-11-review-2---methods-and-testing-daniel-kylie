package gr11review.part2;
import java.io.IOException;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import gr11review.part2.Utility;

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
