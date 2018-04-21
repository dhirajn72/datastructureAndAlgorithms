package com.java.core;

/**
 * @author Dhiraj
 * @date 11/04/18
 */
public class ImmutableTest {
    public static void main(String[] args) {
        Address address= new Address(11,"Blore");
        ImmutableClass immutableClass= new ImmutableClass(11,"blore",address);
        System.out.println(immutableClass);
    }
}
