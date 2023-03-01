package ÖvningsUppgifter.Uppg_3.kidsNames;

import java.util.List;

import static java.util.Arrays.asList;

public class PersonUtil {

    public static List<Person> getPersonList(){

        Person p1 = new Person("Agneta",17);
        Person p2 = new Person("Beatrice",34);
        Person p3 = new Person("Bella",6);
        Person p4 = new Person("Cedar",98);
        Person p5 = new Person("David",54);
        Person p6 = new Person("Eskil",14);
        Person p7 = new Person("Frippe",11);
        Person p8 = new Person("Gustaf",36);
        Person p9 = new Person("Harald",43);
        Person p10 = new Person("Ines",25);


        return asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);
    }

}
