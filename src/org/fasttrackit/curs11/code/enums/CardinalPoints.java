package org.fasttrackit.curs11.code.enums;

public enum CardinalPoints {
    NORTH("N",360),
    SOUTH("S", 180),
    EAST("E",90),
    WEST("W",-90);

    private final String symbol;
    private final Integer degrees;

    CardinalPoints(String symbol, Integer degrees) {
        this.symbol = symbol;
        this.degrees = degrees;
    }

    public static CardinalPoints fromSymbol(String symbol) {
        for (CardinalPoints value : CardinalPoints.values()){
            if(value.symbol.equals(symbol)){
                return value;
            }
        }
        return null;
    }

    public String toDirection(){
        return switch (this) {
            case NORTH -> "UP";
            case SOUTH -> "DOWN";
            case EAST -> "RIGHT";
            case WEST -> "LEFT";
    };
    }

    public String getSymbol() {
        return symbol;
    }

    public Integer getDegrees(){
        return degrees;
    }
}
