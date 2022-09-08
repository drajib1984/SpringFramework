package com.springcoretutorials.StandAloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("StandAloneCollectionConfig.xml");
        Person person3 = (Person) context.getBean("person3");
        System.out.println(person3);
        System.out.println(person3.getFriends().getClass().getName());
        System.out.println(person3.getCourseDetails().getClass().getName());
        System.out.println(person3.getProperties().getClass().getName());
    }
}
