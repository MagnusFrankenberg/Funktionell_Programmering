package ÖvningsUppgifter.Uppg_3.GetOldestPerson;

import java.util.List;

public class GetOldestPersonMain {

    public static void main(String[] args) {

        List<Person> personer = PersonUtil.getPersonList();

        System.out.println(GetOldestPerson.getOldestPerson(personer).getName());


    }
}
