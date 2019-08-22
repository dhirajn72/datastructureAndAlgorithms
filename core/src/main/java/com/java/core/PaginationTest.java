package com.java.core;

/**
 * @author Dhiraj
 * @date 14/08/19
 */
public class PaginationTest {
    public static void main(String[] args) {
        int page=4;
        int fetchSize=20;

        System.out.println("start:"+((page-1)*fetchSize));
        System.out.println("fetch size:"+fetchSize);

    }
}
