package com.java.core;

import java.math.BigDecimal;

/**
 * @author Dhiraj
 * @date 30/04/18
 */
public class RoundTest {
    public static void main(String args[]){

        BigDecimal b = new BigDecimal(23.564);
        BigDecimal roundOff = b.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        System.out.println(roundOff);
        System.out.println(roundOff.doubleValue());


    }
}