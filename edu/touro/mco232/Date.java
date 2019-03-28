package edu.touro.mco232;

class Date {

    private static final int[] MONTH_LENGTHS
            = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int month, dayInMonth, year;

    {
        month = 1;
        dayInMonth = 1;
        year = 4;
    }

    public Date() {
    }

    public Date(int month, int dayInMonth, int year) {
        setMonth(month);
        setDayInMonth(dayInMonth);
        setYear(year);
    }

    public Date(String dateString) {

        String monthString = "";
        String dayString = "";
        String yearString = "";

        for (int i = 0; i < dateString.length(); i++) {
            if (i < 2) {
                monthString = monthString + dateString.charAt(i);
            } else if (i < 4) {
                dayString = dayString + dateString.charAt(i);
            } else {
                yearString = yearString + dateString.charAt(i);
            }
        }

        setMonth(Integer.parseInt(monthString));
        setDayInMonth(Integer.parseInt(dayString));
        setYear(Integer.parseInt(yearString));
    }

    public Date(Date that) {
        this(that.month, that.dayInMonth, that.year);
    }

    public void setMonth(int month) {
        this.month = month;
        validation();
    }

    public void setDayInMonth(int dayInMonth) {
        this.dayInMonth = dayInMonth;
        validation();
    }

    public void setYear(int year) {
        this.year = year;
        validation();
    }

    public int getMonth() {
        return month;
    }

    public int getDayInMonth() {
        return dayInMonth;
    }

    public int getYear() {
        return year;
    }

    private void validation() {
        if (month <= 0 || dayInMonth <= 0 || year < 0) {
            throw new InvalidDateException(month, dayInMonth, year);
        }

        if (!leapYear() && month == 2 && dayInMonth > 28) {
            throw new IllegalArgumentException(String.format("February in a "
                    + "non-leap-year has only 28 days. "
                    + "Day entered: [%d]", dayInMonth));
        }

        if (dayInMonth > MONTH_LENGTHS[month - 1]) {
            throw new InvalidDayInMonthException(month, dayInMonth, MONTH_LENGTHS[month - 1]);
        }

    }

    private boolean leapYear() {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    @Override
    public String toString() {
        return String.format("month = [%d], day = [%d], year = [%d]",
                month, dayInMonth, year);
    }

}
