public class NumberUtils {

    public int getLastDigit(int number) {
        // Write your code here
        if(number < 0) {
            return -1;
        }
        
        String stringNumber = Integer.toString(number);
        char lastChar = stringNumber.charAt(stringNumber.length() - 1);
        int lastDigit = Character.getNumericValue(lastChar);
        
        return lastDigit;
    }
}