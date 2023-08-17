public class StringMagic {

    /**
     * This method finds the rightmost digit in a given string.
     *
     * @param str The string to find the rightmost digit in.
     * @return The rightmost digit in the string. If no digit is found, return -1.
     */
    public int getRightmostDigit(String str) {

        // TODO: Write your code here
        int rightMostDigit = -1;
        
        int limit = str.length();
        for (int i = 0 ; i < limit ; i++) {
            char currentCharacter = str.charAt(i);
             if (Character.isDigit(currentCharacter)) {
                rightMostDigit = Character.getNumericValue(currentCharacter);
            }
        }
        
        
        return rightMostDigit;
    }
}