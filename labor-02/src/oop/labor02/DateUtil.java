package oop.labor02;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.DateTimeException;


public class DateUtil {

    private static final String DATE_FORMAT = "yyyy-MM-dd";

    public static LocalDate parseDate(String dateString) {
        try {
            return LocalDate.parse(dateString, DateTimeFormatter.ofPattern(DATE_FORMAT));
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid date format. Expected: " + DATE_FORMAT, e);
        }
    }
    public static String formatDate(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern(DATE_FORMAT));
    }
    public static boolean leapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
    public static boolean isValidDate() {
        try {
            int day = 10;
            int month = 5;
            int year = 2023;
            YearMonth yearMonth = YearMonth.of(year, month);
            int maxDays = yearMonth.lengthOfMonth();
            return (day >= 1 && day <= maxDays);
        } catch (DateTimeException e) {
            return false;
        }
    }
}
