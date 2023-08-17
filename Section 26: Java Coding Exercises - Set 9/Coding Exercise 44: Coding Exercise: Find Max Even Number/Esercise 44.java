import java.util.List;
import java.util.Optional;

public class FunctionalProgrammingMagic {

    public static int findMaxEvenNumber(List<Integer> numbers) {
        // Write your code here
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        
        Optional<Integer> maxEven = numbers.stream()
        .filter(number -> number % 2 == 0)
        .max(Integer::compare);
        
        return maxEven.orElse(0);
    }
}