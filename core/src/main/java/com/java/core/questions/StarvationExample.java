package com.java.core.questions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Dhiraj
 * @date 23/04/18
 */
public class StarvationExample {
    public static void main(String[] args) {
        Worker worker= new Worker();
        for (int i=1;i<100;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    worker.work();
                }
            }).start();
        }
    }
}





class Worker{

    public synchronized void work() {
        String fileName=Thread.currentThread().getName();
        fileName=fileName+".txt";

        try(BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(new File(fileName)))){
            bufferedWriter.write(Thread.currentThread().getName()+" wrote message" +" Hi !!!");
        }catch (IOException e) {
            e.printStackTrace();
        }

        while (true){
            System.out.println("Print values !!!!");
        }
    }
}
