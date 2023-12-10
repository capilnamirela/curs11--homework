package org.fasttrackit.curs11.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public final class RaportGenerator {
    public static void generateReport(Classroom classroom) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("files/generated-report.txt"));
        bufferedWriter.write("We did it");
        bufferedWriter.close();
    }
}
