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
    
}
