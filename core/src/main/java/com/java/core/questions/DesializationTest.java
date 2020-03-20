package com.java.core.questions;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author Dhiraj
 * @date 15/04/18
 */
public class DesializationTest {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream= new FileInputStream("data.ser")) {
            ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
            Employee1 employee1=(Employee1)objectInputStream.readObject();
            System.out.println(employee1);
            System.out.println(employee1.getPid()+" "+employee1.getName());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
