package ÖvningsUppgifter.Uppg_3.FlattenCollection;

import java.util.List;

import static java.util.Arrays.asList;

public class FlattenCollectionMain {

    public FlattenCollectionMain(){

        List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));

        System.out.println(collection);

        List<String> result = FlattenCollection.transform(collection);
        System.out.println(result);

        System.out.println();

        List<List<List<String>>> collection2 = asList(asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third")));
        System.out.println(collection2);
        List<String> result2 = FlattenCollection.goingDeeper(collection2);
        System.out.println(result2);

    }





    public static void main(String[] args) {
        FlattenCollectionMain m = new FlattenCollectionMain();
    }
}
