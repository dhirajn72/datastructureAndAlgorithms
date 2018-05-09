package com.java.core.questions;

/**
 * @author Dhiraj
 * @date 05/05/18
 */
public class Immutable {
    private final int value;

    public Immutable(int value) {
        System.out.println("Immutable(int value)");
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
