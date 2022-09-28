package gr11review.part2;

public class Utility {

    public static void main (String[] args){
        System.out.print(xyzMiddle("AAxyzBB"));

    }

    // Methods 3
    public static boolean xyzMiddle(String str){
        if (str.contains("xyz") && (str.length() % 2 != 0)){
            int intYPlacement = (str.length() - 1) / 2;
            int intXPlacement = intYPlacement - 1;
            int intZPlacement = intZPlacement + 1;

            if ((str.charAt(intYPlacement) == 'y') && (str.charAt(intXPlacement) == 'x') && (str.charAt(intZPlacement) == 'z')){
                return true;
            }
            else{
                return false;

            }
        }
        
        else{
            return false;
        }
 
                
    
    

    
}
