package edu.touro.mco232;

public class InvalidDateException extends IllegalArgumentException {
    
    public InvalidDateException(int month, int dayInMonth, int year) {
        super(String.format("Invalid date. Day and month must be postitive,"
                + " and year cannot be negative."
                + " Date was: Month: [%d], Day: [%d], Year: [%d]",
                month, dayInMonth, year));
    }
    
    public InvalidDateException(String message) {
        super(message);
    }
    
}
