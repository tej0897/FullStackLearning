package Java8.Lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {

        // before Java8

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Result is: " + comparator.compare(2,3));

        // using Lambda

        Comparator<Integer> comparatorLambda = (Integer a,Integer b) ->  a.compareTo(b);
        System.out.println("Result using Lambda is: " + comparatorLambda.compare(2,1));

        Comparator<Integer> comparatorLambda1 = (a, b) ->  a.compareTo(b);
        System.out.println("Result using Lambda-1 is: " + comparatorLambda1.compare(2,3));


    }
}
