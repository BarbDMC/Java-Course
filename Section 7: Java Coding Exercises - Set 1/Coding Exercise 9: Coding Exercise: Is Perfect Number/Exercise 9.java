public class PerfectNumberChecker {
    public boolean isPerfectNumber(int number) {
        System.out.println(number);
        int divisorsSum = 0;
        
        if(number <= 0) {
            return false;
        }
 
        for (int i = 1; i < number; i++) {
            if(number % i == 0) {
                divisorsSum += i;
            }
        }
        
        return divisorsSum == number;
    }
}