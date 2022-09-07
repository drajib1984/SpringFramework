package com.springcoretutorials.AmbiguityProblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AmbiguityProblemConfig.xml");
        Addition addition = (Addition) context.getBean("addition");
        addition.doSum();

    }
}
