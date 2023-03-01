package ÖvningsUppgifter.Uppg_3.lessThanFour;

import java.util.List;

import static java.util.Arrays.asList;

public class LessThanFourMain {

    public LessThanFourMain(){

        List<String> myList = asList("Hej", "Jag", "heter", "Magnus","och","kan","läsa");

        List<String> result = LessThanFour.transform(myList);
        System.out.println(result);

    }



    public static void main(String[] args) {
        LessThanFourMain lm = new LessThanFourMain();
    }

}
