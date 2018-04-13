package com.java.core.thread.starvation;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @author Dhiraj
 * @date 13/04/18
 */
public class Worker1 {

    public synchronized void work(){

        Thread thread= Thread.currentThread();
        String name= thread.getName()+".txt";

        try(BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(name))){
            bufferedWriter.write("Thread: "+name+" wrote this message");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        while (true){
            System.out.println(name + " is working");
        }
    }
}
