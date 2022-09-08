package com.springcoretutorials.FullyAnotationBasedSpring.UsingOnlyBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UniversityConfig.class);
        University university = (University) context.getBean("checkUni");
        university.implementingMethods();
        context.close();

    }
}
