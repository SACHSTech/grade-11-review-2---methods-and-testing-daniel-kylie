package gr11review.part2;

public class Utility {

    public static void main (String[] args){
        System.out.print(xyzMiddle("AAxyzB"));

    }

    // Methods 3

    public static boolean xyzMiddle(String str){
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
}
