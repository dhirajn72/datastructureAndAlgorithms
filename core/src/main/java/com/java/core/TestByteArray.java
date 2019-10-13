package com.java.core;

import java.io.ByteArrayInputStream;

/**
 * @author Dhiraj
 * @date 12/09/19
 */
public class TestByteArray {
    public static void main(String[] args) {
        ByteArrayInputStream stream=new ByteArrayInputStream("scenario.xls".getBytes());
        System.out.println(stream.read());

    }

}
