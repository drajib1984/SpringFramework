package com.springcoretutorials.FullyAnotationBasedSpring.UsingComponent_ComponentScan_Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(CollegeConfiguration.class);
        College college = (College) context.getBean("GoldenValley");
        college.test();
        context.close();

    }
}
