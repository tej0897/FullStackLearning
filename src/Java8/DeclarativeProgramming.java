package Java8;

import java.util.stream.IntStream;

public class DeclarativeProgramming {
    public static void main(String[] args) {
        // what style of programming

        int sum = IntStream.rangeClosed(0,100)
                .sum();
        System.out.println("Sum using Declarative method is: " +sum);
    }
}
