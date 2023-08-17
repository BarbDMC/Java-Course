public class FactorialCalculator {

    public int calculateFactorial(int number) {
        // Write your code here
        int factorial = number == 0 ? 1 : number;
        int initialNumber = number - 1;
        
        for (int i = initialNumber ; i > 0 ;i-- ){
            factorial *= i;
        } 
        
        return number >= 0 ? factorial : -1;
    }
}