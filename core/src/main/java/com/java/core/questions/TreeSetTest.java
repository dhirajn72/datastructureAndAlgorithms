package com.java.core.questions;

import java.util.TreeSet;

/**
 * @author Dhiraj
 * @date 14/04/18
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Employee> employees=new TreeSet<>();
        employees.add(new Employee());
    }
}
class Employee implements Comparable{

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}