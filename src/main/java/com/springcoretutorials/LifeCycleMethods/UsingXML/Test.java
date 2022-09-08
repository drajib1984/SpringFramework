package com.springcoretutorials.LifeCycleMethods.UsingXML;

import com.springcoretutorials.LifeCycleMethods.UsingXML.Course;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("LifeCycleConfig.xml");
        Course course = (Course) context.getBean("course");
        System.out.println(course);
        System.out.println(course.getCourseFee());
        context.registerShutdownHook();// calling destroy method
    }
}
