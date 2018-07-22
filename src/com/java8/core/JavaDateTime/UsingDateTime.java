package com.java8.core.JavaDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.*;

public class UsingDateTime {

    public static void main(String[] args) {

        // Dates are immutable. To add dates it creates a new refrerence to display the add dates.
        LocalDate date = LocalDate.of(2018, Month.JANUARY, 15);
        System.out.println(date);
        date = date.plusDays(5).plusMonths(3);  // it needs to be re-assigned to a variable
        System.out.println(date);


        LocalTime time = LocalTime.of(10, 40);
        System.out.println(time);
        time = time.minusHours(10).minusMinutes(40);  // it needs to be reassigned to variable
        System.out.println(time);

        LocalDateTime dtetime = LocalDateTime.of(date, time);
        System.out.println(dtetime);
        dtetime = dtetime.minusHours(10);
        System.out.println(dtetime);


        // some exam tricks in java8 exam
        LocalDate ld = LocalDate.of(2015, Month.MARCH, 12);
        ld.plusDays(10);  // return is ignoted because it is not assigned to variable
        System.out.println(ld); // intial values assigned is printed

       // ld.plusMinutes(10);   not complie because minutes methods used for Date

        LocalTime lt = LocalTime.of(8, 15, 10);
     //    lt.addDays(3);   will not compile becasue we are trying to add days to time

    }
}
