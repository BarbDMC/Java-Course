public class MyString {

    public String str;

    public MyString(String str) {
        this.str = str;
    }
    
    public boolean isHexadecimalChar(char ch) {
        // Write your code here
        char lowerCaseChar = Character.toLowerCase(ch);
       return lowerCaseChar >= 'a' && lowerCaseChar <= 'f';
    }

    public boolean isHexadecimal() {
        // Write your code here
        if(str == null || str.equals("")) {
            return false;
        }
        
        char [] charactersArray = str.toCharArray();
        
        for (char character: charactersArray) {
            if(!isHexadecimalChar(character) && !Character.isDigit(character)) {
                return false;
            }
        }
        
        return true;
    }

    
}