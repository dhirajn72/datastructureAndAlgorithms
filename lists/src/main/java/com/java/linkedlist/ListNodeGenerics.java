package com.java.linkedlist;

/**
 * @author Dhiraj
 * @date 25/09/18
 */
public class ListNodeGenerics<T> {
    private T data;
    private ListNodeGenerics<T> next;

    public ListNodeGenerics(T date) {
        this.data = date;
    }

    public T getData() {
        return data;
    }

    public void setData(T date) {
        this.data = date;
    }

    public ListNodeGenerics<T> getNext() {
        return next;
    }

    public void setNext(ListNodeGenerics<T> next) {
        this.next = next;
    }
}
