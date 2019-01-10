package com.java.core;

import java.util.Date;

/**
 * @author Dhiraj
 * @date 09/01/19
 */
public  class ImmutableDemo {
    private final StringBuilder name;
    private final Date dob;

    public ImmutableDemo(StringBuilder name,Date dob){
        this.name=name;
        this.dob=dob;
    }
    public StringBuilder getName() {
        return new StringBuilder(this.name);
    }
    public Date getDob() {
        return new Date(dob.getTime());
    }

    @Override
    public String toString() {
        return name+" "+dob;
    }

    public static void main(String[] args) {
        ImmutableDemo obj= new ImmutableDemo(new StringBuilder("Dhiraj"),new Date(1990-1900,10,23));
        System.out.println(obj.getName()+" "+obj.getDob());
        obj.getName().delete(0,1);
        obj.getDob().setTime(System.currentTimeMillis());
        System.out.println(obj.getName()+" "+obj.getDob());
        InterTest t= new InterTest();
        t.m1();
    }
}

class OverridingImmutableDemo extends ImmutableDemo{

    public OverridingImmutableDemo(StringBuilder name, Date dob) {
        super(name, dob);
    }

    @Override
    public String toString() {
        return super.getDob()+" "+super.getName();
    }
}

interface Inter1{
    default void m1(){
        System.out.println("Inter1 m1()");
    }
    static void m2(){
        System.out.println("Inter1 m2()");
    }
}
interface Inter2{
    default void m1(){
        System.out.println("Inter2 m1()");
    }
    static void m2(){
        System.out.println("Inter2 m2()");
    }
}

class InterTest implements Inter1,Inter2{
    @Override
    public void m1() {
        Inter1.super.m1();
        Inter2.super.m1();

        Inter1.m2();
        Inter2.m2();
    }
}