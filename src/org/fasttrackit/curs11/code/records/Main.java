package org.fasttrackit.curs11.code.records;

import static org.fasttrackit.curs11.code.records.ElectronicsType.*;

public class Main {
    public static void main(String[] args) {
        Electronics myElectronics = new Electronics("myElectronics", "BEKO", 400, WASHING_MACHINE);
        System.out.println(myElectronics.name());
        System.out.println(myElectronics.producer());
        System.out.println(myElectronics.price());
        System.out.println(myElectronics);
        myElectronics.saySomething();

    }
}
