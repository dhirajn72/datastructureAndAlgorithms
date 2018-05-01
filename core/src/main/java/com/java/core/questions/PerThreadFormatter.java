package com.java.core.questions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * @author Dhiraj
 * @date 01/05/18
 */
public class PerThreadFormatter {
    private static final ThreadLocal<SimpleDateFormat> dateFormatHolder = new ThreadLocal<SimpleDateFormat>() {

        /*
         * initialValue() is called
         */
        @Override
        protected SimpleDateFormat initialValue() {
            System.out.println("Creating SimpleDateFormat for Thread : " + Thread.currentThread().getName());
            return new SimpleDateFormat("dd/MM/yyyy");
        }
    };

    /*
     * Every time there is a call for DateFormat, ThreadLocal will return calling
     * Thread's copy of SimpleDateFormat
     */
    public static DateFormat getDateFormatter() {
        return dateFormatHolder.get();
    }
}