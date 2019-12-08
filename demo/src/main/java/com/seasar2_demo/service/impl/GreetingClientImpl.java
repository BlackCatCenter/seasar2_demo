package com.seasar2_demo.service.impl;


import com.seasar2_demo.service.Greeting;
import com.seasar2_demo.service.GreetingClientService;

public class GreetingClientImpl implements GreetingClientService {

    private Greeting greeting;

    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }

    public void execute() {
        System.out.println(greeting.greet());
    }
}