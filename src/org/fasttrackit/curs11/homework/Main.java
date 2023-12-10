package org.fasttrackit.curs11.homework;

import java.io.IOException;

import static org.fasttrackit.curs11.homework.FileProvider.populateWithStudentGrades;
import static org.fasttrackit.curs11.homework.RaportGenerator.generateReport;

public class Main {
    public static void main(String[] args) throws IOException {
        Classroom classroom = new Classroom(populateWithStudentGrades("grades.txt"));
        System.out.println(classroom.getStudentGrades());
        System.out.println(classroom.getMaxGrade());
        generateReport(classroom);

    }
}
