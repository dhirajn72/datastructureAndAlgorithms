package com.java.linkedlist;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 26/09/18
 */
public class ArrayList {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] elemenArray = {};
    private int size = 0;

    public ArrayList() {
        this.elemenArray = new Object[INITIAL_CAPACITY];
    }

    public void add(int element) {
        if (size == elemenArray.length)
            increaseSize();
        elemenArray[size++] = element;

    }

    private void increaseSize() {
        elemenArray = Arrays.copyOf(elemenArray, INITIAL_CAPACITY * 2);
    }

    public Object get(int index) {
        rangeCheck(index);
        return elemenArray[index];
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                    + index);
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(elemenArray[i] + " ");
        }
    }

    public Object remove(int index) {
        rangeCheck(index);
        Object removedElement = elemenArray[index];
        for (int i = index; i < size; i++)
            elemenArray[i] = elemenArray[i + 1];
        size--;
        return removedElement;
    }

    public int size() {
        System.out.println(elemenArray.length);
        return size;
    }
}
