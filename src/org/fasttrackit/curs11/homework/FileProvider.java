package org.fasttrackit.curs11.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;
import static java.util.regex.Pattern.quote;

public class FileProvider {

    public static List<StudentGrade> populateWithStudentGrades(String filePath) throws FileNotFoundException {
        List<StudentGrade> studentGrades = new ArrayList<>();
        Scanner scanner = new Scanner(new File("files", filePath));
        while (scanner.hasNext()) {
            //["Ealhstan Saira", "Computer Science", "8"]
            String[] result = scanner.nextLine().split(quote("|"));
            studentGrades.add(new StudentGrade(result[0], result[1], parseInt(result[2])));

        }
        return studentGrades;
    }
}
