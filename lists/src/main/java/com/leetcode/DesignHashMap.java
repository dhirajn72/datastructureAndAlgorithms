package com.leetcode;

/**
 * @author Dhiraj
 * @date 28/07/19
 */
public class DesignHashMap {
}


class MyHashMap {
    int[] hash;

    /** Initialize your data structure here. */
    public MyHashMap() {
        hash=new int[1000000];

    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        hash[key]=value+key;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return hash[key]-key;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        hash[key]=Integer.MIN_VALUE;

    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */