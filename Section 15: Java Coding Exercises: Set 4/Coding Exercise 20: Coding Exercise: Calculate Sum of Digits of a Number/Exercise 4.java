public class NumberUtils {

    public int getSumOfDigits(int number) {
        // Write your code here
        
         if(number < 0){
            return -1;
        }
        
        int sum = 0;
        String stringNumber = Integer.toString(number);
        int limit = stringNumber.length() - 1;
        
        for (int i = 0; i <= limit ; i++){
            char stringDigit = stringNumber.charAt(i);
            int digit = Character.getNumericValue(stringDigit);
            
            sum += digit;
        } 
        
        return sum;
    }
}