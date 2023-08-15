public class SumOfSquares {
    public long calculateSumOfSquares(int n) {
       // write your code here
       int squaresSum = 0;
       
       if(n < 0) {
           return -1;
       }
       
       for (int i=1; i <= n ; i++ ){
           int square = (int) Math.pow(i, 2);
           squaresSum += square;
       }
       
       return squaresSum;
    }
}