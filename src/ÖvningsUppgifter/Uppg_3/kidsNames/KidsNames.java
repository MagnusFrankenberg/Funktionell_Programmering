package ÖvningsUppgifter.Uppg_3.kidsNames;

import java.util.List;

public class KidsNames {

    public static List<String> getKidNames(List<Person> people) {
        return people.stream().filter(p -> p.getAge()<18).map(Person::getName).toList();

    }
    }