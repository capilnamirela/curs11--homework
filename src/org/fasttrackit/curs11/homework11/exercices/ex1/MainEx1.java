package org.fasttrackit.curs11.homework11.exercices.ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainEx1 {
    public static void main(String[] args) {
        Map<String, Integer> studentGrade = new HashMap<>();
        studentGrade.put("Alexandru", 10);
        studentGrade.put("Mihai", 10);
        studentGrade.put("Andreea", 8);
        studentGrade.put("Daniel", 7);
        studentGrade.put("Bogdan", 5);

        System.out.println(studentGrade);

        Set<Map.Entry<String, Integer>> entries = studentGrade.entrySet();
        System.out.println("The highest grade is: " + getMax(studentGrade.entrySet()));
        System.out.println("Students with the highest grade: " + highestGrade(studentGrade.entrySet()));

    }

    private static Map<String, Integer> highestGrade(Set<Map.Entry<String, Integer>> entries) {
        Map<String, Integer> highestGrade = new HashMap<>();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() == getMax(entries)) {
            highestGrade.put(entry.getKey(), entry.getValue());
        }
    }
        return highestGrade;
}

    private static Integer getMax(Set<Map.Entry<String, Integer>> entries) {
        Integer max = 0;
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }
}
