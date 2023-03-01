package ÖvningsUppgifter.Uppg_3.upperCase;

import java.util.List;

public class UpperCase {

    public static List<String> transform(List<String> l){
        return l.stream().map(s -> s.toUpperCase()).toList();
    }
}