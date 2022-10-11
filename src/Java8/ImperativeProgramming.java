package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImperativeProgramming {
    public static void main(String[] args) {
        // how style of programming

        // example 1
        int sum = 0;
        for(int i=0; i<=100;i++){
            sum += i;
        }
        System.out.println("Sum using Imperative method is: " +sum);

        // example 2

        List<Integer> integerList = Arrays.asList(1,2,3,4,4,5,5,5,6,6,7,8,8,8,9,9,9,0);

        List<Integer> uniqueList = new ArrayList<>();

        for (Integer i : integerList){
            if (!uniqueList.contains(i)){
                uniqueList.add(i);
            }
        }
        System.out.println(uniqueList);

    }
}
