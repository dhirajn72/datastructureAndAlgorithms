package com.java.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Dhiraj
 * @date 12/09/19
 */
public class GenericComparator {
    public static void main(String[] args) {
        Employee e1=new Employee(3,"dk");
        Employee e2=new Employee(1,"dk");
        Employee e3=new Employee(6,"dk");
        Employee e4=new Employee(9,"dk");
        Employee e5=new Employee(8,"dk");

        List<Employee> employees=new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        System.out.println(employees);
        Collections.sort(employees,new CustomComparator());
        System.out.println(employees);

        System.out.println("********");

        Intern i1=new Intern(3,"dk");
        Intern i2=new Intern(1,"dk");
        Intern i3=new Intern(6,"dk");
        Intern i4=new Intern(9,"dk");
        Intern i5=new Intern(8,"dk");
        List<Intern> interns=new ArrayList<>();
        interns.add(i1);
        interns.add(i2);
        interns.add(i3);
        interns.add(i4);
        interns.add(i5);
        System.out.println(interns);
        Collections.sort(interns,new CustomComparator());
        System.out.println(interns);
        System.out.println("**********");

        ExEmployee ee1=new ExEmployee(3,"zebra");
        ExEmployee ee2=new ExEmployee(3,"apple");
        ExEmployee ee3=new ExEmployee(3,"dhiraj");
        ExEmployee ee4=new ExEmployee(3,"ball");
        ExEmployee ee5=new ExEmployee(3,"mubarak");
        List<ExEmployee> exEmployees=new ArrayList<>();
        exEmployees.add(ee1);
        exEmployees.add(ee2);
        exEmployees.add(ee3);
        exEmployees.add(ee4);
        exEmployees.add(ee5);
        System.out.println(exEmployees);
        Collections.sort(exEmployees,new CustomComparator());
        System.out.println(exEmployees);
    }
}
interface Person{

}

class Employee implements Person{
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
class Intern implements Person{
    int id;
    String name;

    public Intern(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
class ExEmployee implements Person{
    int id;
    String name;

    public ExEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class CustomComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        if (o1 instanceof Employee && o2 instanceof Employee){
            Employee ob1=(Employee)o1;
            Employee ob2=(Employee)o2;
            return ob1.id-ob2.id;
        }
        else if (o1 instanceof Intern && o2 instanceof Intern){
            Intern ob1=(Intern)o1;
            Intern ob2=(Intern)o2;
            return ob2.id-ob1.id;
        }
        else if (o1 instanceof ExEmployee && o2 instanceof ExEmployee){
            ExEmployee ob1=(ExEmployee)o1;
            ExEmployee ob2=(ExEmployee)o2;
            return ob1.name.compareTo(ob2.name);
        }
        return -1;
    }
}