package com.springcoretutorials.CollectionInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTestClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionInjectionConfig.xml");
        Employee employee = (Employee) context.getBean("employee");

        System.out.println(employee.getEmployeeName());
        System.out.println(employee.getCourses());
        System.out.println(employee.getPhones());
        System.out.println(employee.getAddresses());

        System.out.println(employee);
    }
}
