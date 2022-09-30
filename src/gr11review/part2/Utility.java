package gr11review.part2;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

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
    

    
}
