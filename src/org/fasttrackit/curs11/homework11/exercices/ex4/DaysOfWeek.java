package org.fasttrackit.curs11.homework11.exercices.ex4;

public enum DaysOfWeek {
    MONDAY("Mon"),
    TUESDAY("Tues"),
    WEDNESDAY("Wed"),
    THURSDAY("Thurs"),
    FRIDAY("Fri"),
    SATURDAY("Sat"),
    SUNDAY("Sun");

    private final String symbol;

    DaysOfWeek(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public String daySchedule() {
        return switch (this) {
            case MONDAY -> "Activity 1";
            case TUESDAY -> "Activity 2";
            case WEDNESDAY -> "Activity 3";
            case THURSDAY -> "Activity 4";
            case FRIDAY -> "Activity 5";
            case SATURDAY -> "Activity 6";
            case SUNDAY -> "Activity 7";
        };

    }
}
