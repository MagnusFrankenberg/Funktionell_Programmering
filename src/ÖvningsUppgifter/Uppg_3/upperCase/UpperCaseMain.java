package ÖvningsUppgifter.Uppg_3.upperCase;

import java.util.List;

import static java.util.Arrays.asList;

public class UpperCaseMain {

    public static void main(String[] args) {

        List<String> myList = asList("kollar","om","detta","blir","versaler");

        List<String> result = UpperCase.transform(myList);
        System.out.println(result);

    }
}
