public class ArrayMagic {

    /**
     * This method reverses an array.
     * 
     * @param array the array to reverse
     * @return a new array with elements in reverse order
     */
    public int[] reverseArray(int[] array) {

        // TODO: Write your code here
        
        if(array.length == 0) {
            return array;
        }
        
        int start = 0;
        int end = array.length - 1;
        
        int [] reversed = new int[array.length];
        
        while (start <= end) {
            reversed[start] = array[end];
            reversed[end] = array[start];
            
            start++;
            end--;
        }
        
        return reversed;
    }
}