package model;

public enum TimePeriod {
    WEEKLY(7),
    DAILY(1),
    TWODAYS(2);

    private final int value;
    TimePeriod(int value) {
        this.value=value;
    }
    public int getValue() {
        return value;
    }
}
