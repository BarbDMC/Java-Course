public class LeapYearChecker {
    public boolean isLeapYear(int year) {
        boolean isDivisibleBy4 = year > 0 && year % 4 == 0;
        boolean isDivisibleBy100 = year > 0 && year % 100 == 0;
        boolean isDivisibleBy400 = year > 0 && year % 400 == 0;
        
        if(isDivisibleBy4 && isDivisibleBy100 && isDivisibleBy400) {
            return true;
        }
        
         if(isDivisibleBy4 && !isDivisibleBy100) {
            return true;
        }
        
        return false;
    }
}