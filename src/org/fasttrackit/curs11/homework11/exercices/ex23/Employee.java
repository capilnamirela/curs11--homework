package org.fasttrackit.curs11.homework11.exercices.ex23;

public class Employee extends Person{
    String company;
    Integer salary;

    public Employee(String name, Integer age, String hairColour, String company, Integer salary) {
        super(name, age, hairColour);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return " Name: %s, age: %s, hairColour: %s, Company: %s, salary: %s ".formatted(name(),age(),hairColour(),company,salary);
    }
}
