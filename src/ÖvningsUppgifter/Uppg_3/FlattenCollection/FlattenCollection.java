package ÖvningsUppgifter.Uppg_3.FlattenCollection;

import java.util.List;

public class FlattenCollection {

    public static List<String> transform(List<List<String>> l) {
        return l.stream().flatMap(x->x.stream()).toList();
    }

    //valfri att implementera
    static List<String> goingDeeper(List<List<List<String>>> collection) {
        return collection.stream().flatMap(x->x.stream()).flatMap(y->y.stream()).toList();
    }
}