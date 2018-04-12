package com.java.utils;


import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 11/04/18
 */
public class MyArrayList<E> {
    private static final int INITIAL_CAPACITY=10;
    private Object[] arr;
    private int size=0;

    public MyArrayList(){
        arr=new Object[INITIAL_CAPACITY];
    }

    public int size(){
        return size;
    }

    public void add(E element){
        if (arr.length<size){
            increaseArraySize();
        }
        arr[size++]=element;
    }

    private void increaseArraySize() {
        arr= Arrays.copyOf(arr,INITIAL_CAPACITY*2);
    }

    public void display(){
        for (int i=0;i<=size-1;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public E get(int index){
        if (index<0 || index>size){
            throw  new ArrayIndexOutOfBoundsException("Index :"+index+" Size : "+size);
        }
        return (E)arr[index-1];
    }

    public E remove(int index){
        if (index<0 || index>size){
            throw  new ArrayIndexOutOfBoundsException("Index :"+index+" Size : "+size);
        }
        E removedItem = (E)arr[index-1];
        for (int i=index-1;i<size;i++){
            arr[i]=arr[i+1];
        }
        size--;
        return removedItem;
    }
}
