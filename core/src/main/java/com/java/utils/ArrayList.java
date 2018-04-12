package com.java.utils;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 11/04/18
 */
public class ArrayList<E> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] arr={};
    private int size=0;

    public ArrayList() {
        arr=new Object[INITIAL_CAPACITY];
    }

    public void add(E object){
        if (size==arr.length){
            increaseArraySize();
        }
        arr[size++]=object;

    }

    private void increaseArraySize() {
        arr= Arrays.copyOf(arr,INITIAL_CAPACITY*2);
    }

    public E get(int index){
        if(index<0 || index> size){
            throw  new IndexOutOfBoundsException("Index: "+index+" Size: "+size);
        }

        return (E) arr[index-1];
    }

    public E remove(int index){

        if (index<0 || index>size){
            throw  new IndexOutOfBoundsException("Index: "+index+" Size: "+size);
        }

        E removedElement= (E) arr[index-1];

        for (int i=index-1 ;i<size-1;i++){
            arr[i] = arr[i+1];
        }
        size--;
        return removedElement;
    }

    public void display(){
        for (int i=0;i<=size-1;i++){
            System.out.println(arr[i]+" ");
        }

    }
}
