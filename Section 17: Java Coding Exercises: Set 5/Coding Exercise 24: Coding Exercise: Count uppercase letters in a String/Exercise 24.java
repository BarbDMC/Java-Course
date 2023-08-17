public class StringMagic {
    
    /**
     * This method counts the number of uppercase letters in a given string.
     *
     * @param str The string to count uppercase letters in.
     * @return The number of uppercase letters in the string.
     */
    public int countUppercaseLetters(String str) {
        // TODO: Write your code here
        
        if(str == null) {
            return 0;
        }
        
        int counter = 0;
        for(int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            boolean isUppercaseLetter = Character.isUpperCase(letter);
            
            if(isUppercaseLetter) {
                counter++;
            }
        }
        
        return counter;
    }
}