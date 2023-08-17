public class StringMagic {

    /**
     * This method finds the longest word in a given sentence.
     *
     * @param sentence The sentence to find the longest word in.
     * @return The longest word in the sentence. If sentence is empty, return an empty string.
     */
    public String findLongestWord(String sentence) {

        // TODO: Write your code here
        String[] words = sentence.split(" ");
        int limit = words.length;
        int longestLength = 0;
        String longestWord = "";
        
        for (int i = 0; i < limit ; i++){
            String word = words[i];
            int wordLength = word.length();
            
            if(wordLength > longestLength) {
                longestLength = wordLength;
                longestWord = word = words[i];
            }
        }
        
        return longestWord;
    }
}