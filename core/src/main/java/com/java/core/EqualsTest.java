package com.java.core;

/**
 * @author Dhiraj
 * @date 15/09/19
 */
public class EqualsTest {
    public static void main(String[] args) {
        Test1 t1=new Test1(1,"dk");
        Test2 t2=new Test2(2,"singh");
        Object ob=t1;
        System.out.println(ob.equals(t1));
        System.out.println("***********");
        ob=t2;
        System.out.println(ob.equals(t1));
    }
}

class Test1{
    int id;
    String name;

    public Test1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println(id);
        System.out.println(name);
        return true;
    }
}

class Test2{
    int sid;
    String sname;

    public Test2(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println(sid);
        System.out.println(sname);
        return true;
    }
}