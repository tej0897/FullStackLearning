package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DeclarativeProgramming {
    public static void main(String[] args) {
        // what style of programming

        // example 1

        int sum = IntStream.rangeClosed(0,100)
                .sum();
        System.out.println("Sum using Declarative method is: " +sum);

        // example 2:

        List<Integer> integerList = Arrays.asList(1,2,3,4,4,5,5,5,6,6,7,8,8,8,9,9,9,0);
        List<Integer> distinctList = integerList.stream()
                                        .distinct()
                                        .toList();
        System.out.println(distinctList);
    }
}
