package gr11review.part2;

import java.io.File;
import java.util.Scanner;
import java.io.*;

/**
 * Grade 11 review part 2 
 * @author D.Gu
 * 
 */

public class Utility {

    /**
     * Determines if the string is xy-balanced, meaning there is a 'y' character behind all the 'x' characters
     * 
     * @param str The user inputted string
     * @return isBalanced, whether the string is xy-balanced
     * 
     */
    public static boolean xyBalance(String str) {
        // Initialize the return value to be false (if there is no 'y' char it will remain false)
        boolean isBalanced = false;

        // Check each of the index values for the user inputted string
        for (int intCount = 0; intCount < str.length(); intCount++){
            // If there is an 'x' character, temporarily make set it to be not balanced
            if (str.charAt(intCount) == 'x'){
                isBalanced = false;
            }
            // If there is a 'y' character, the string will be balanced
            else if (str.charAt(intCount) == 'y'){
                isBalanced = true;
            }
        }
        // return whether or not the string is xy-balanced
        return isBalanced;
    }

     
    
    /**
     * Given a file with one word on each line, return the word with the most characters
     * 
     * @param filenametxt The name of the file
     * @return strLongestWord, the word with the most characters in the text file
     * 
     */
    public static String longestWord(String filenametxt) throws IOException {
        // Initialize characters in the longest word to be 0
        int intCharacters = 0;
        String strCompare = "";
        String strLongestString = "";
        Scanner myScanner = new Scanner(new File(filenametxt));
        
        // As long as the txt file has another line, set it equal to strCompare
        while (myScanner.hasNextLine()) {
            strCompare = myScanner.nextLine();

            // If there are more characters in strCompare, it is the new longest word
            if (strCompare.length() > intCharacters) {
                strLongestString = strCompare;
                intCharacters = strLongestString.length();
            }
        }
        // Close the scanner and return the longest word
        myScanner.close();
        return strLongestString;
    }



    /**
     * Given an array of integers, remove all 10s and replace them with 0s at the end of the array
     *
     * @param nums An array of integers numbers
     * @return int[] intCopy, the inputted array after it has been changed
     *
     */
    public static int[] withoutTen(int[] nums) {
        // Make a copy of the array and initialize number of zeros
        int[] intCopy = new int[nums.length];
        int intZeros = 0;
       
        // Check all the array numbers in nums to see if they are 10
        for (int intIndex = 0; intIndex < nums.length; intIndex++){
            if (nums[intIndex] == 10){
                intZeros++;
            }
           
            // Copy the index over if 10 is not stored in it
            else if (nums[intIndex] != 10){
                intCopy[intIndex - intZeros] = nums[intIndex];
            }
        }
       
        // Add the same number of 0s at the end of the copy, as there are 10s in the original
        if (intZeros != 0){
            for (int intCount = 0; intCount < intZeros; intCount++){
                intCopy[(nums.length - 1) - intCount] = 0;
            }
        }
        return intCopy;
    }
    


    /**
     * Given two arrays of ints, return true if all of the numbers in inner array appear in the outer array
     *
     * @param outer An array of outer integers numbers
     * @param inner An array of inner integer numbers
     * @return true or false, do all the inner integers appear in the outer array
     *
     */
    public static boolean linearIn(int[] outer, int[] inner) {
        // Initialize variable for how many times matching integers are found
        int intSame = 0;
        int intNum = 0;
        // Nested for loop to compare each integer on the arrays
        for (int intCount = 0; intCount < outer.length; intCount++){
           
            // Set intCount2 = intCount because the integers are in increasing order
            for (int intCount2 = intNum; intCount2 < inner.length; intCount2++){
                if (outer[intCount] == inner[intCount2]){
                    // After finding a pair of matching integers, break the inner loop
                    // Inner loop continues at intCount2 + 1
                    intSame++;
                    intNum = intCount2 + 1;
                    break;
                }
            }
        }
        // If all inner integers are found, return true
        if (intSame == inner.length){
            return true;
        }
        // Otherwise return false
        else {
            return false;
        }
    }
     
 
 
    /**
     * Takes a 2D array and reverses all the content in the array
     *
     * @param arr A 2D array that needs to be reversed
     * @return int[][] intReverse, the reversed 2D array
     *
     */
    public static int[][] reverse(int[][] arr) {
        // Create a new 2D array to store the changes
        int[][] intReverse = new int[arr.length][arr[0].length];
       
        // Initialize the largest indexe numbers in a 2D array
        int intY = arr[0].length - 1;
        int intX = arr.length - 1;
       
        // Reverse the integers' order in the 2D array
        for (int intRow = 0; intRow <= intX; intRow++) {
            for (int intColumn = 0; intColumn <= intY; intColumn++) {
                // Set the copy equal to the reversed 2D array
                intReverse[intX - intRow][intY - intColumn] = arr[intRow][intColumn];
            }
        }
        return intReverse;
    }

    
}
