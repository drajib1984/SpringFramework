package com.springcoretutorials;

import com.springcoretutorials.SetterInjection.Student;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SetterTestClass {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SetterInjectionConfig.xml");
        Student student1 = (Student) context.getBean("student1");//type casting
        System.out.println(student1);
        Student student2 = (Student) context.getBean("student2");
        System.out.println(student2);
    }

}
