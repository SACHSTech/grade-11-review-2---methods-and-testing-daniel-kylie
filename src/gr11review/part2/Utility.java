package gr11review.part2;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;



public class Utility {

    public static void main (String[] args){

        // Method 3 
        System.out.print(xyzMiddle("AAxyzB"));

        // Array 3 - Checking the output
        int myarray[] = {1, 0, 0, 1};
        System.out.println(Arrays.toString(zeroFront(myarray)));


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

        // define variables
        

        // go through all the words in the file 
        
            
        }
        // close the file 

        // return the word that would be first in alphabetical order

    

    /*
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

    // Arrays - 1D, 2 Loops
    public static boolean canBalance(int[] nums){
        // define variables
        boolean isBalanced;
        

   }

    

}
