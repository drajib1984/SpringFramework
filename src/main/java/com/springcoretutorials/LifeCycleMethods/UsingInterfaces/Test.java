package com.springcoretutorials.LifeCycleMethods.UsingInterfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext
                ("LifeCycleConfig.xml");
        Pizza pizza = (Pizza) context.getBean("pizza");
        System.out.println(pizza);
        context.registerShutdownHook();
    }
}
