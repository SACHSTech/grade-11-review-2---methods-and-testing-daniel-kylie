package gr11review.part2;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;



import java.io.File;
import java.util.Scanner;
import java.io.*;

/**
 * Grade 11 review part 2 
 * @author D.Gu 
 * @author K.Sinclair
 * 
 */

public class Utility {
    
    /**
     * Determines if the string is xy-balanced, meaning there is a 'y' character behind all the 'x' characters
     * 
     * @param str The user inputted string
     * @return isBalanced, whether the string is xy-balanced
     * @author D. Gu
     */
    public static boolean xyBalance(String str) {
        // Initialize the return value to be false (if there is no 'y' char it will remain false)
        boolean isBalanced = false;

        // Check each of the index values for the user inputted string
        for (int intCount = 0; intCount < str.length(); intCount++){
            // If there is an 'x' character, temporarily make set it to be not balanced
            if (str.charAt(intCount) == 'x') {
                isBalanced = false;
            }
            // If there is a 'y' character, the string will be balanced
            else if (str.charAt(intCount) == 'y') {
                isBalanced = true;
            }
        }
        // return whether or not the string is xy-balanced
        return isBalanced;
    }

    /**
     * Methods 3
     * Determines if the substring "xyz" appears in the exact middle of a larger string
     * 
     * @param str, the string that is being tested in the method
     * @returns a boolean of true or false 
     * @author K. Sinclair
     */

    public static boolean xyzMiddle(String str){
        // define the return boolean
        boolean isXYZMiddle;
    
        // when the string contains 'xyz' and length of string is odd
        if (str.contains("xyz") && (str.length() % 2 != 0)){

            // create character placement expectations for 'xyz' in the middle
            int intYPlacement = (str.length() - 1) / 2;
            int intXPlacement = intYPlacement - 1;
            int intZPlacement = intYPlacement + 1;

            // check if the character placements are in the middle
            if ((str.charAt(intYPlacement) == 'y') && (str.charAt(intXPlacement) == 'x') && (str.charAt(intZPlacement) == 'z')){
                isXYZMiddle = true;
            }
            else{
                isXYZMiddle = false;
            }
        }
        else{
            isXYZMiddle = false;
        }
        return isXYZMiddle;
    }
    
    /**
     * Given a file with one word on each line, return the word with the most characters
     * 
     * @param filenametxt The name of the file
     * @return strLongestWord, the word with the most characters in the text file
     * @author D. Gu
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
     * File IO - Read 2
     * Evaluates a list of words and determines which word will come first in alphabetical order
     * 
     * @param filenametxt, the file that contains the list of names being tested
     * @returns strAlphaWord, the word that comes first alphabetically
     * @author K. Sinclair
     */
    
    public static String alphaWord (String filenametxt) throws IOException{
        // read the file
        Scanner scanFile = new Scanner(new File(filenametxt));
        
        // define variables
        String strWord = "";
        String strAlphaWord = "z";

        // go through all the words in the file 
        while (strWord != null) {
            strWord = scanFile.nextLine();

            // if the word comes before alphabetically, then replace it with that word
            if (strWord!=null && strAlphaWord.compareToIgnoreCase(strWord) > 0){ 
                strAlphaWord = strWord;
            }
        }
        // close the scanner
        scanFile.close();

        // return the word that comes alphabetically first 
        return strAlphaWord;
    }
    
    /**
     * Given an array of integers, remove all 10s and replace them with 0s at the end of the array
     *
     * @param nums An array of integers numbers
     * @return int[] intCopy, the inputted array after it has been changed
     * @author D. Gu
     */
    public static int[] withoutTen(int[] nums) {
        // Make a copy of the array and initialize number of zeros
        int[] intCopy = new int[nums.length];
        int intZeros = 0;
       
        // Check all the array numbers in nums to see if they are 10
        for (int intIndex = 0; intIndex < nums.length; intIndex++) {
            if (nums[intIndex] == 10) {
                intZeros++;
            }
           
            // Copy the index over if 10 is not stored in it
            else if (nums[intIndex] != 10) {
                intCopy[intIndex - intZeros] = nums[intIndex];
            }
        }
       
        // Add the same number of 0s at the end of the copy, as there are 10s in the original
        if (intZeros != 0) {
            for (int intCount = 0; intCount < intZeros; intCount++) {
                intCopy[(nums.length - 1) - intCount] = 0;
            }
        }
        return intCopy;
    }
    
    /**
     * Arrays 3 - One Dimensional 
     * Returns an array that contains the same numbers as in the given array, except it is rearranged so that all the zeros are at the front of the array
     * 
     * @param nums the array 
     * @return newArray, the new rearranged array with the zeros at the front and remaining integers following
     * @author K. Sinclair
     */

    public static int[] zeroFront(int[] nums){
        // define variable to count number of zeros and new array
        int intZeroCount = 0;
        int[] newArray = new int[nums.length];

        // for loop to determine number of zeros and to put them at the front of the new array
        for (int i = 0; i < nums.length; i++){

            // if statement to check that the int is 0 and add the 0 at the front of the new array
            if (nums[i] == 0){
                newArray[intZeroCount] = 0;
                intZeroCount++;
            }
        }
        // for loop to return the rest of the int 
        for (int j = 0; j < nums.length; j++){

            // if statement to check that the int is not a 0 and add the int to the end of the new array
            if (nums[j] != 0) {
                newArray[intZeroCount++] = nums[j];
            }
        }
        // return the new array with all the zeros in the front 
        return newArray;
    }

    /**
     * Given two arrays of ints, return true if all of the numbers in inner array appear in the outer array
     *
     * @param outer An array of outer integers numbers
     * @param inner An array of inner integer numbers
     * @return true or false, do all the inner integers appear in the outer array
     * @author D. Gu
     */
    public static boolean linearIn(int[] outer, int[] inner) {
        // Initialize variable for how many times matching integers are found
        int intSame = 0;
        int intNum = 0;
        // Nested for loop to compare each integer on the arrays
        for (int intCount = 0; intCount < outer.length; intCount++) {
           
            // Set intCount2 = intCount because the integers are in increasing order
            for (int intCount2 = intNum; intCount2 < inner.length; intCount2++) {
                if (outer[intCount] == inner[intCount2]) {
                    // After finding a pair of matching integers, break the inner loop
                    // Inner loop continues at intCount2 + 1
                    intSame++;
                    intNum = intCount2 + 1;
                    break;
                }
            }
        }
        // If all inner integers are found, return true
        if (intSame == inner.length) {
            return true;
        }
        // Otherwise return false
        else {
            return false;
        }
    }
     
    /**
     * Arrays 5 - One Dimensional - Two Loops
     * Evaluates if the non-empty array can split the array so that the sum of the numbers can equal the other side. 
     * 
     * @param nums the array 
     * @return returnValue, a boolean value that states whether the array can be spit into two equal sums
     * @author K. Sinclair
     */
    public static boolean canBalance (int[] nums){ 
    
        // defining the variables
        int intTotalSum = 0; 
        int intSumLeft = 0;
        int intSumRight; 
        int intArrLength = nums.length; 
        boolean returnValue = false;
    
        // finds the sum of the entire array of integers 
        for (int i = 0; i < intArrLength; i++) { 
            intTotalSum += nums[i]; 
        }
    
        // repeats until end of the array 
        for (int j = 0; j < intArrLength; j++) { 
    
          // determines the sum of left side and sum of right side  
          intSumLeft += nums[j]; 
          intSumRight = intTotalSum - intSumLeft; 
          
          // if the sums are equivallent then it is true
          if (intSumLeft == intSumRight) {
            returnValue = true;
          }
        }
        // if the sums aren't equal return value is false
        returnValue = false;

        // output the boolean return value
        return returnValue; 
      }
 
    /**
     * Takes a 2D array and reverses all the content in the array
     *
     * @param A 2D array that needs to be reversed
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

    /**
     * Arrays 8 - Two Dimensional 
     * This method outputs a portion of a 2D array based on the specific row and col 
     * 
     * @param row goes through the row of the given array
     * @param col goes through the column of the given array
     * @return intReturnArray, returns a portion of the 2D array based on the specific row and column
     * @author K. Sinclair
     */
    public static int[][] split(int[][] arr, int row, int col){        
        // make a variable for the return array 
        int[][] intReturnArray = new int[row + 1][col + 1];

        // creating the return array through nested for loop to go through colums then rows
        for(int i = 0; i <= col; i++) {
            for(int j = 0; j <= row; j++) {
                // correct formating for the return array
                intReturnArray[j][i] = arr[j][i];
            }
        }

        // Output the return array
        return intReturnArray;
    }
}
