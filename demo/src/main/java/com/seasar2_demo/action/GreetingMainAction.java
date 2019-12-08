package com.seasar2_demo.action;

import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.S2ContainerFactory;

import com.seasar2_demo.service.Greeting;
import com.seasar2_demo.service.GreetingClientService;
import com.seasar2_demo.service.impl.GreetingClientImpl;
import com.seasar2_demo.service.impl.GreetingImpl;

public class GreetingMainAction {

	
	
	private static final String PATH =
	        "app.dicon";
    public static void main(String[] args) {
    	S2Container container =  S2ContainerFactory.create(PATH);
    	container.init();       
    	GreetingClientService greetingClientService = (GreetingClientService)container.getComponent(GreetingClientService.class);  
    	greetingClientService.execute();
    	           
    	        
    }
}