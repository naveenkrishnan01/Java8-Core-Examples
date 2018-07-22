package com.java8.core.JavaDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

import java.time.*;

public class CreatingDateAndTime {

    public static void main (String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate localDate = LocalDate.of(2018,  Month.JANUARY, 1);
            LocalTime localTime = LocalTime.of(2, 30);

            System.out.println(localDate);
            System.out.println(localTime);
            System.out.println(LocalDateTime.of(localDate, localTime));

            // before java 8
           System.out.println(new Date());

        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, 02, 15);
        Date january = calendar.getTime();
        System.out.println(january);





    }
}