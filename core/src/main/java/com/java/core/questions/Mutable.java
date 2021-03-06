package com.java.core.questions;

/**
 * @author Dhiraj
 * @date 05/05/18
 */
public class Mutable extends Immutable {
    private int realValue;

    public Mutable(int value) {
        super(value);

        realValue = value;
    }

    public int getValue() {
        return realValue;
    }
    public void setValue(int newValue) {
        realValue = newValue;
    }

    public static void main(String[] arg){

        Mutable obj = new Mutable(4);
        Immutable immObj = obj;
        System.out.println(immObj.getValue());
        obj.setValue(8);
        System.out.println(immObj.getValue());
    }
}
