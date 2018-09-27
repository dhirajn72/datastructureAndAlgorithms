package com.java.linkedlist;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 27/09/18
 */
public class ArrayList1 {
    private final int INITIAL_CAPACITY=10;
    private Object[] elementArray;
    private int size;

    public ArrayList1(){
        elementArray=new Object[INITIAL_CAPACITY];
    }

    public void add(int data){
        if (size==elementArray.length)increaseSize();
        elementArray[size++]=data;
    }

    private void increaseSize() {
        elementArray= Arrays.copyOf(elementArray,INITIAL_CAPACITY*2);
    }
    public Object remove(int index){
        checkRange(index);
        Object removedElement=elementArray[index];
        for (int i=index;i<size;i++)
            elementArray[i]=elementArray[i+1];
        size--;
        return removedElement;
    }

    private void checkRange(int index) {
        if (index<0||index>=size)
            throw new IndexOutOfBoundsException("Index :"+index+" Size :"+size);
    }
    public Object get(int index){
        checkRange(index);
        return elementArray[index];
    }
    public int size(){
        return size;
    }
    @Override
    public String toString() {
        if (size==0)return "[]";
        StringBuilder sb= new StringBuilder("[");
        int i=0;
        while (i<size){
            sb.append(elementArray[i]+",");
            i++;
        }
        sb.append("]");
        sb.deleteCharAt(sb.length()-2);
        return sb.toString();
    }
}