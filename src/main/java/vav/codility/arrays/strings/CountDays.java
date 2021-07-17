package vav.codility.arrays.strings;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.DAYS;

public class CountDays {

    public int daysBetweenDates(String date1, String date2) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");

        LocalDate d1 = LocalDate.parse(date1, formatter);
        LocalDate d2 = LocalDate.parse(date2, formatter);
        return (int) Math.abs(DAYS.between(d1, d2));
    }
}
