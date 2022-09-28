package gr11review.part2;
import java.io.BufferedReader;
import java.io.*;

import java.io.IOException;


public class Utility {

    public static void main (String[] args){
        System.out.print(xyzMiddle("AAxyzB"));

    }

    /*
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

     
    // File IO - Read 2
    /*
     * File IO - Read 2
     * Evaluates a list of words and determines which word will come first in alphabetical order
     * 
     * @param filenametxt, the file that contains the list of names being tested
     * @returns the word that comes first alphabetically
     * @author K. Sinclair
     */
    
    public static String alphaWord (String filenametxt) throws IOException{
        // read the file
        BufferedReader file = new BufferedReader (FileReader(filenametxt));

        // define variables
        String strWord = "";
        String strOutputWord = "z";

        // go through all the words in the file 
        while (strWord != null){
            strWord = file.readLine();

            if ((strWord != null) && (strOutputWord.compareToIgnoreCase(strWord) > 0 )){
                strOutputWord = strWord;
            }
            
        }
        // close the file 
        file.close();

        // return the word that would be first in alphabetical order
        return strOutputWord;

    }

    private static Reader FileReader(String filenametxt) {
        return null;
    }

}
