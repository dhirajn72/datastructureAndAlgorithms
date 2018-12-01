package com.java.core;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * @author Dhiraj
 * @date 04/10/18
 */
public class DateRangeCheck {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2018, Month.SEPTEMBER, 1);
        LocalDate end = LocalDate.of(2018, Month.OCTOBER, 15);

        Period period = Period.between(start, end);
        System.out.println(period);

        LocalDate date1 = LocalDate.of(2018, Month.AUGUST, 15);

        if ( !(date1.isAfter(start) && date1.isBefore(end))) {
            System.out.println("True");
        }
    }

}
