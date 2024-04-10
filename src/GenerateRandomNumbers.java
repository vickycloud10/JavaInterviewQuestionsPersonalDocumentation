import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class GenerateRandomNumbers {
    // The below function generates non-duplicated sorted random numbers up to 10 and then prints the first 10 sorted numbers
    public int[] generateRandomNumbersAndPrintOnlyFirstTenDistinctNumbersUsingStreams() {
        int [] randomNumbers = IntStream.generate(() -> new Random().nextInt(100)).limit(100).toArray();
        return Arrays.stream(randomNumbers).distinct().sorted().filter(number -> number <= 10).toArray();
    }
}
