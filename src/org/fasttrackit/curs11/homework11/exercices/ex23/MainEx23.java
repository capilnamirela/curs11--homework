package org.fasttrackit.curs11.homework11.exercices.ex23;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainEx23 {
    public static void main(String[] args) {

        List<Person> personLists = new ArrayList<>();
        personLists.add(new Person("Mihai", 25, "dark"));
        personLists.add(new Person("Andreea", 26, "red"));
        personLists.add(new Person("George", 33, "blonde"));
        personLists.add(new Person("Andrei", 65, "grey"));
        personLists.add(new Person("Ioana", 25, "blue"));

        System.out.println("Persons: " + personLists);
        System.out.println("Person's names: " + getNames(personLists));
        System.out.println("Name and age: " + fromNameToAge(personLists));
        System.out.println("Persons older than: " + olderThan(personLists, 30));
        System.out.println("Persons hair colour and name: " + fromHairColourToName(personLists));
        System.out.println("Age to persons:" + fromAgeToListOfPersons(personLists));

        System.out.println("--------------------------------");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Mihai", 25, "dark", "Company1", 2000));
        employeeList.add(new Employee("Andreea", 26, "red", "Company2", 5000));
        employeeList.add(new Employee("George", 33, "blonde", "Company1", 4500));
        employeeList.add(new Employee("Alexandra", 45, "black", "Company3", 2500));

        System.out.println("Employees with salaries bugger than: " + getSalariesBiggerThan(employeeList, 3000));
        System.out.println(personFromCompany(employeeList, "Company1"));
        System.out.println("Sum of all salaries: " + sumOfSalaries(employeeList));
        System.out.println(biggestSalary(employeeList));

    }

    @NotNull
    private static List<String> getNames(List<Person> personLists) {
        List<String> names = new ArrayList<>();
        for (Person index : personLists) {
            names.add(index.name());
        }
        return names;
    }

    @NotNull
    private static Map<String, Integer> fromNameToAge(List<Person> personLists) {
        Map<String, Integer> nameToAge = new HashMap<>();
        for (Person index : personLists) {
            nameToAge.put(index.name(), index.age());
        }
        return nameToAge;
    }

    @NotNull
    private static List<Person> olderThan(List<Person> personLists, Integer ageToCompare) {
        List<Person> oldenThan = new ArrayList<>();
        for (Person index : personLists) {
            if (index.age() > ageToCompare) {
                oldenThan.add(index);
            }
        }
        return oldenThan;
    }

    @NotNull
    private static Map<String, String> fromHairColourToName(List<Person> personLists) {
        Map<String, String> hairColourToName = new HashMap<>();
        for (Person index : personLists) {
            hairColourToName.put(index.hairColour(), index.name());
        }
        return hairColourToName;
    }

    @NotNull
    private static Map<Integer, Person> fromAgeToListOfPersons(List<Person> personLists) {
        Map<Integer, Person> ageToListOfPersons = new HashMap<>();
        for (Person index : personLists) {
            ageToListOfPersons.put(index.age(), index);
        }
        return ageToListOfPersons;
    }

    @NotNull
    private static List<Employee> getSalariesBiggerThan(List<Employee> employeeList, Integer salaryToCompare) {
        List<Employee> salariesBiggerThan = new ArrayList<>();
        for (Employee index : employeeList) {
            if (index.salary > salaryToCompare) {
                salariesBiggerThan.add(index);
            }
        }
        return salariesBiggerThan;
    }

    @NotNull
    private static Map<String, String> personFromCompany(List<Employee> employeeList, String companyRequested) {
        Map<String, String> personToCompany = new HashMap<>();
        for (Employee index : employeeList) {
            if (index.company.equals(companyRequested)) {
                personToCompany.put(index.name(), index.company);
            }
        }
        return personToCompany;
    }

    private static Integer sumOfSalaries(List<Employee> employeeList) {
        Integer sum = 0;
        for (Employee index : employeeList) {
            sum += index.salary;
        }
        return sum;
    }

    private static String biggestSalary(List<Employee> employeeList) {
        Integer max = 0;
        String company = null;
        for (Employee index : employeeList) {
            if (index.salary > max){
                max = index.salary;
                company = index.company;
            }
        }
        System.out.print("The bigges salary is: " + max + " and is given by the company: ");
        return company;
    }

}
