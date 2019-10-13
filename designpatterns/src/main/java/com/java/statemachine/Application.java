package com.java.statemachine;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author Dhiraj
 * @date 23/09/19
 */


public class Application {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StateMachineConfig.class);
        System.out.println(context);

    }

}
