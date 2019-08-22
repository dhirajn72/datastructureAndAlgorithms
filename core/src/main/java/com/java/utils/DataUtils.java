package com.java.utils;

import com.java.algorithms.LinkedList;
import com.java.algorithms.ListNode;
import interview.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dhiraj
 * @date 29/09/18
 */
public class DataUtils {
    public static Map<String, Integer> getMapObject() {
        Map<String, Integer> map = new HashMap<>();
        map.put("zeplin", 1);
        map.put("apple", 7);
        map.put("violin", 2);
        map.put("box", 21);
        map.put("yack", 6);
        return map;
    }

    public static int[] getArray() {
        return new int[]{9, 8, 7, 6, 5};
    }
    public static int[] getUnorderedArray() {
        return new int[]{9, 2, 8, 1, 7, 3, 6, 5};
    }

    public static int[] getSortedIntArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;
        return arr;
    }


    public static List<Person> getPersonList() {
        return Stream.iterate(1, id -> ++id).limit(50).
                map(id -> {
                    Person p = new Person();
                    p.setId(id);
                    p.setFname("fname".concat(String.valueOf(id)));
                    p.setLname("lname".concat(String.valueOf(id)));
                    p.setEmail("email".concat(String.valueOf(id)));
                    p.setPhone(id);
                    return p;
                }).
                collect(Collectors.toList());
    }

    public static LinkedList getList() {
        LinkedList list=new LinkedList();

        list.add(10);
        list.add(11);
        /*list.add(12);
        list.add(11);
        list.add(13);
        list.add(15);*/


        return list;
    }


    public static ListNode _getLoopedList() {
        ListNode listNode= new ListNode(1);
        listNode.setNext(new ListNode(2));
        listNode.getNext().setNext(new ListNode(3));
        listNode.getNext().getNext().setNext(new ListNode(4));
        ListNode loop=new ListNode(5);
        listNode.getNext().getNext().getNext().setNext(loop);
        listNode.getNext().getNext().getNext().getNext().setNext(new ListNode(6));
        listNode.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(7));
        listNode.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(8));
        listNode.getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(loop);
        //System.out.println(listNode);// !TODO// Don't uncomment, code phat jayega idhar
        return listNode;
    }
}

class Test {
    String name;

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                '}';
    }
}