package edu.touro.mco232;

public class NegativeDateException extends InvalidDateException {

    public NegativeDateException(int month, int dayInMonth, int year) {
        super(String.format("Date cannot be negative. Was: %d/%d/%d",
                month, dayInMonth, year));
    }

}
