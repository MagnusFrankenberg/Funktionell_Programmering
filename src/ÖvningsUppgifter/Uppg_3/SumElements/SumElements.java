package ÖvningsUppgifter.Uppg_3.SumElements;

import java.util.List;

public class SumElements {

    public static int calculate(List<Integer> numbers) {
        return numbers.stream().reduce(0,(sum,e)->sum+e);
    }
}
