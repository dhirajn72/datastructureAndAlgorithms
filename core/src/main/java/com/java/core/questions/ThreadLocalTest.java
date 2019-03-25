package com.java.core.questions;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

/**
 * @author Dhiraj
 * @date 01/05/18
 */
public class ThreadLocalTest {

    public static void main(String args[]) throws IOException, InterruptedException {
        Thread t1 = new Thread(new Task());
        Thread t2 = new Thread(new Task());

        t1.start();
        //t1.join();
        t2.start();
        //t2.join();

    }

    /*
     * Thread safe format method because every thread will use its own DateFormat
     */
    public static String threadSafeFormat(Date date) {
        DateFormat formatter = PerThreadFormatter.getDateFormatter();
        return formatter.format(date);
    }

}
