package com.java.linkedlist;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 27/09/18
 */
public class ArrayList2 {
    private final int INITIAL_CAPACITY = 10;
    private Object[] elementArray;
    private int size;

    public ArrayList2() {
        elementArray = new Object[INITIAL_CAPACITY];
    }

    public void add(Object data) {
        if (size == elementArray.length)
            increaseSize();
        elementArray[size++] = data;
    }

    public Object get(int index) {
        checkRange(index);
        return elementArray[index];
    }

    private void checkRange(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index:" + index + " Size:" + size);
    }

    public Object remove(int index) {
        checkRange(index);
        Object removed = elementArray[index];
        for (int i = index; i < size; i++)
            elementArray[i] = elementArray[i + 1];
        size--;
        return removed;
    }

    private void increaseSize() {
        elementArray = Arrays.copyOf(elementArray, INITIAL_CAPACITY * 2);
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (size==0)return "[]";
        StringBuilder builder= new StringBuilder("[");
        int i=0;
        while (i<size){
            builder.append(elementArray[i]+",");
            i++;
        }
        builder.append("]");
        builder.deleteCharAt(builder.length()-2);
        return builder.toString();
    }
}