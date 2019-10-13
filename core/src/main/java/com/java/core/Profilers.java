package com.java.core;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Dhiraj
 * @date 11/09/19
 */
public class Profilers {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress inetAddress=InetAddress.getLocalHost();
        System.out.println(inetAddress);
    }
}
