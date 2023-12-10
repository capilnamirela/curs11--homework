package org.fasttrackit.curs11.homework;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private final List<StudentGrade> studentGrades = new ArrayList<>();

    public Classroom(List<StudentGrade> studentGrades) {
        this.studentGrades.addAll(studentGrades);
    }

    public List<StudentGrade> getStudentGrades(){
        return studentGrades;
    }
    public Integer getMaxGrade() {
        if (studentGrades.isEmpty()) {
            return 0;
        }
        Integer max = studentGrades.get(0).getGrade();
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getGrade()> max){
                max= studentGrade.getGrade();
            }
        }

        return max;
    }
}
