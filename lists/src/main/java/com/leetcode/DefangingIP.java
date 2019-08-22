package com.leetcode;

/**
 * @author Dhiraj
 * @date 27/07/19
 */
public class DefangingIP {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));

    }

    public static String defangIPaddr(String address) {
        String[] ips=address.split("\\.");
        StringBuilder b=new StringBuilder();
        for (int i = 0; i <ips.length-1 ; i++) {
            b.append(ips[i]).append("[.]");
        }
        return b.append(ips[ips.length-1]).toString();
    }
}

/*


1,0,0,2,3,0,0,4,5,0,0


1,0,0,0,2,3,0,4,5,0
1,0,0,0,0,0,0,


 */
