package com.springcoretutorials.SpringExpressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringExpressionLanguageConfig.xml");
        Demo demo = (Demo) context.getBean("LoveSpring");
        System.out.println(demo);

    }
}
