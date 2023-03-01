package ÖvningsUppgifter.Uppg_3.SumElements;

import java.util.List;

import static java.util.Arrays.asList;

public class SumElementsMain {

    public static void main(String[] args) {

        List<Integer> numbers = asList(1, 2, 3, 4, 5);

        int result = SumElements.calculate(numbers);

        System.out.println(result);

    }
}
