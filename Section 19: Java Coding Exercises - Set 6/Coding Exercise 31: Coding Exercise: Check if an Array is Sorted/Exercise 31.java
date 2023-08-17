public class ArrayMagic {

    /**
     * This method checks if the input array is sorted in ascending order.
     * 
     * @param array the array to check
     * @return true if the array is sorted, false otherwise
     */
    public boolean isSorted(int[] array) {

        // TODO: Write code here
        for (int i = 0; i < array.length; i++){
            int previousNumber = i == 0 ? array[i] : array[i - 1];
            int currentNumber = array[i];
            
            if(previousNumber > currentNumber) {
                return false;
            }
        }
        
        return true;
    }
}