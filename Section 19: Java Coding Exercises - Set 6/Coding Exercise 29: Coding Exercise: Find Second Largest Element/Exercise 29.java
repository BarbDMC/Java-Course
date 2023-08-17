public class ArrayMagic {
    
    /**
     * This method finds and returns the second largest element in the given array.
     * 
     * @param array the array in which to find the second largest element
     * @return the second largest element in the array
     */
     
    public int findSecondLargestElement(int[] array) {
        //TODO: Write your code here
         if (array.length == 1) {
            return -1; 
        }
        
        int largestNumber = 0;
        int secondLargestNumber = 0;
        
        for (int i = 0; i < array.length; i++){
            if (array[i] > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = array[i];
            } else if (array[i] > secondLargestNumber && array[i] != largestNumber) {
                secondLargestNumber = array[i];
            }
        }
        
        
        return secondLargestNumber == 0 ? -1 : secondLargestNumber;
    }
}