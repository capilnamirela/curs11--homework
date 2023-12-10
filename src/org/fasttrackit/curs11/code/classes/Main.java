package org.fasttrackit.curs11.code.classes;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Mihai");
        Person.Adress adress = person.new Adress("Streeeet", "Cittttyyy");
        adress.showAdress();

        Person.School school = new Person.School("Liceul de arta");
        System.out.println(school.getSchoolName());

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        };
    }
}
