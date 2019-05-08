package com.java.core;

/**
 * @author Dhiraj
 * @date 16/03/18
 */
public class PassByValue {
    public static void main(String[] args) {
        Test test1= new Test();
        test1.setName("Dhiraj");
        Test test2= new Test();
        test2.setName("Singh");

        //System.out.println("Before Changing::::::"+test1.getName()+" "+test2.getName());
        PassByValue passByValue= new PassByValue();
       // passByValue.passByValue(test1,test2);
        //System.out.println("Pass by Value::::::::"+test1.getName()+" "+test2.getName());


        System.out.println("***********");
        passByValue.passByReference(test1,test2);
        System.out.println("Pass by reference::::"+test1.getName()+" "+test2.getName());
    }
    void passByValue(Test test1,Test  test2){
        Test temp=test1;
        test1=test2;
        test2=temp;
    }
    void passByReference(Test test1,Test  test2){
        /*test1.setName("XXXXX");
        test2.setName("YYYYY");*/
        test1=new Test();
    }
}


class Test{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}