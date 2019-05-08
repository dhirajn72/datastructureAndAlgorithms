package com.java.core.thread;

import java.util.List;

/**
 * @author Dhiraj
 * @date 03/05/19
 */
public class TestReadWrite {
    public static void main(String[] args) {



        synchronized (Calculation.class){

        }
    }
}


class Calculation implements Runnable{
    private List<Integer> integers;

    @Override
    public void run() {

    }



    public List<Integer> getIntegers() {
        return integers;
    }

    public void setIntegers(List<Integer> integers) {
        this.integers = integers;
    }
}