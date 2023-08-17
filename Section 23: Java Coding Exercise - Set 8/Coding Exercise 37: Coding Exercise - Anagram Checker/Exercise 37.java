import java.util.Arrays;

public class StringMagic {

    public boolean areAnagrams(String str1, String str2) {
    
        // Write your code here
        
        if(str1 == null || str2 == null) {
            return false;
        }
        
        if(str1.length() != str2.length()) {
            return false;
        }
        
        
        String str1LowerCase = str1.toLowerCase();
        String str2LowerCase = str2.toLowerCase();
        
        char [] str1Array = str1LowerCase.toCharArray();
        char [] str2Array = str2LowerCase.toCharArray();
        
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        
        return Arrays.equals(str1Array, str2Array);
        
    }
}