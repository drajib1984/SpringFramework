package com.springcoretutorials.StereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("StereoTypeAnnotationConfig.xml");
        Student student = (Student) context.getBean("azad");
        System.out.println(student);
        System.out.println(student.hashCode());

//singleton
        Student student1 = (Student) context.getBean("azad");
        System.out.println(student1.hashCode());

        Student student2 = (Student) context.getBean("azad");
        System.out.println(student2.hashCode());
    }
}
