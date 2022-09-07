package com.springcoretutorials.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorInjectionConfig.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person.getName());
        System.out.println(person.getId());
        System.out.println(person.getCertificate());
        System.out.println(person.getList());
        System.out.println(person);
    }
}
