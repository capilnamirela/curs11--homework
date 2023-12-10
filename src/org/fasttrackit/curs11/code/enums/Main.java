package org.fasttrackit.curs11.code.enums;

public class Main {
    public static void main(String[] args) {
        System.out.println(CardinalPoints.EAST);
        System.out.println(CardinalPoints.EAST.getSymbol());
        System.out.println(CardinalPoints.EAST.getDegrees());
        System.out.println(CardinalPoints.EAST.toDirection());
        System.out.println(CardinalPoints.NORTH.toDirection());

        System.out.println(CardinalPoints.fromSymbol("N"));
        System.out.println(ComplexCardinalPoints.NORTH_EAST);
    }
}
