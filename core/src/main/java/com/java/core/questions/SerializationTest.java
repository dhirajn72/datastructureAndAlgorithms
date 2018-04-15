package com.java.core.questions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Dhiraj
 * @date 15/04/18
 */
public class SerializationTest {

    public static void main(String[] args) {
        Employee1 employee1= new Employee1(99,"Dhiraj");
        employee1.setPid(88);
        employee1.setName("kumar");
        try(FileOutputStream fileOutputStream= new FileOutputStream(new File("data.ser"))) {
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee1);
            System.out.println("Object written to file !");

        }catch (Exception e){
            e.printStackTrace();

        }

    }
}
//class Person implements Serializable{
class Person {
   private int pid;
   private String name;

    public Person(int pid, String name) {
        this.pid = pid;
        this.name = name;
    }

    public Person() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                '}';
    }
}

class Employee1 extends  Person implements Serializable{
    private int eid;
    private String ename;

    public Employee1(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    public Employee1() {
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                '}';
    }
}
