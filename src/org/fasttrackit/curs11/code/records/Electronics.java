package org.fasttrackit.curs11.code.records;

public record Electronics(
        String name,
        String producer,
        Integer price,
        ElectronicsType type
) {

    public void saySomething() {
        System.out.println("bla bla");
    }

}
