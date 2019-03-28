package edu.touro.mco232;

public class InvalidDayInMonthException extends InvalidDateException {

    public InvalidDayInMonthException(int month, int dayInMonth, int monthLength) {
        super(String.format("Invalid day. Month [%d] has only [%d] days. "
                + "Day entered: [%d]", month, monthLength, dayInMonth));
    }
}
