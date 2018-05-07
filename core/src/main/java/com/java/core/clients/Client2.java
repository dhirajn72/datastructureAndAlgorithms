package com.java.core.clients;

import com.java.core.thread.Consumer3;
import com.java.core.thread.Producer3;
import com.java.core.thread.ProducerConsumer3;

/**
 * @author Dhiraj
 * @date 04/05/18
 */
public class Client2 {
    public static void main(String[] args) {
        ProducerConsumer3  producerConsumer= new ProducerConsumer3();
        new Thread(new Producer3(producerConsumer)).start();
        new Thread(new Consumer3(producerConsumer)).start();
    }
}
