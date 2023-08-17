public class StringMagic {

    public String reverseWordsInSentence(String sentence) {
        // TODO: Check if the sentence is null.
        // If the sentence is null, return "INVALID"
        if(sentence == null) {
            return "INVALID";
        }

        // TODO: Check if the sentence is empty.
        // If the sentence is empty, return an empty string
         if(sentence.equals("")) {
            return "";
        }

        // TODO: Split the sentence into words using the split method. 
        // Use " " as the delimiter to match space.
        String [] words = sentence.split(" ");

        // TODO: Create a StringBuilder to hold the reversed sentence.
        StringBuilder reversedSentence = new StringBuilder();

        // TODO: Loop through each word in the words array.
        for(String word : words) {
            // TODO: For each word, create a StringBuilder and reverse the word.
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            // Append the reversed word, followed by a space, to the reversed sentence.
            reversedSentence.append(reversedWord).append(" ");
        }

        // TODO: After reversing all the words, trim the trailing space and return the reversed sentence
        String reversedSentenceString = reversedSentence.toString().trim();
        
        return reversedSentenceString;
    }
}