package com.java.statemachine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.EnableStateMachine;

/**
 * @author Dhiraj
 * @date 23/09/19
 */

public class Runner implements ApplicationContextAware {

    @Autowired
    private StateMachine<States, Events> stateMachine;

    ApplicationContext applicationContext;

    //@Override
    public void run(String... args) throws Exception {
        stateMachine.sendEvent(Events.E1);
        stateMachine.sendEvent(Events.E2);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)  {
        this.applicationContext=applicationContext;
    }
}
