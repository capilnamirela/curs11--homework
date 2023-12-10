package org.fasttrackit.curs11.code.enums;

public enum ComplexCardinalPoints {
    NORTH_WEST(CardinalPoints.NORTH, CardinalPoints.WEST),
    NORTH_EAST(CardinalPoints.NORTH, CardinalPoints.EAST),
    SOUTH_WEST(CardinalPoints.SOUTH, CardinalPoints.WEST),
    SOUTH_EAST(CardinalPoints.SOUTH, CardinalPoints.EAST);

    private final CardinalPoints firstDirection;
    private final CardinalPoints secondDirection;

    ComplexCardinalPoints(CardinalPoints firstDirection, CardinalPoints secondDirection) {
        this.firstDirection = firstDirection;
        this.secondDirection = secondDirection;
       }

    public CardinalPoints getFirstDirection() {
        return firstDirection;
    }

    public CardinalPoints getSecondDirection() {
        return secondDirection;
    }
}
