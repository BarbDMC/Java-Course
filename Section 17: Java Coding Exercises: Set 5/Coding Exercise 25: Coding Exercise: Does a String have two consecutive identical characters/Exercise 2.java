public class StringMagic {

    /**
     * This method checks if a given string has two consecutive identical characters.
     *
     * @param str The string to check for consecutive duplicates.
     * @return true if the string has consecutive duplicates, false otherwise.
     */
    public boolean hasConsecutiveDuplicates(String str) {
        System.out.println(str);
        
        // TODO: Write your code here
        
        int limit = str.length() - 1;
        for(int i = 0; i < limit; i++) {
            int currentPosition = i;
            int nextPosition = i == limit ? i : i + 1;
            
            char currentLetter = str.charAt(currentPosition);
            System.out.println(currentLetter);
            char nextLetter = str.charAt(nextPosition);
            System.out.println(nextLetter);
            
            boolean isConsecutiveDuplicate = currentLetter == nextLetter;
            
            if(isConsecutiveDuplicate) {
                return true;
            }
        }
        
        return false;
    }
}