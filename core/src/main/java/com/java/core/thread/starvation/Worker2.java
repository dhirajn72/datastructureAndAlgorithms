package com.java.core.thread.starvation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Dhiraj
 * @date 04/05/18
 */
public class Worker2 {
    public synchronized void work() throws IOException{

        String fileName=Thread.currentThread().getName();
        fileName=fileName+".txt";

        try(BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(fileName))) {
            bufferedWriter.write(Thread.currentThread().getName()+" wrote this !!");
        }
        while (true){
            System.out.println("Using resource for long time !!" + Thread.currentThread().getId());
        }
    }
}
