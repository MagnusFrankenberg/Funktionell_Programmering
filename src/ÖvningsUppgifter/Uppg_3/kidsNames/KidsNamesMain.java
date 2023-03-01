package ÖvningsUppgifter.Uppg_3.kidsNames;

import java.util.List;

public class KidsNamesMain {

    public static void main(String[] args) {

        List<Person> personList = PersonUtil.getPersonList();

        List<String> result = KidsNames.getKidNames(personList);

        System.out.println(result);


    }
}
