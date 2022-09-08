package com.springcoretutorials.FullyAnotationBasedSpring.UsingOnlyBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UniversityConfig {
    @Bean
    public Teacher MathTeacherInfo(){
        return new MathTeacher();
    }
    @Bean(name = "chance")
    public Chancellor chancellorInfo(){
        return new Chancellor();
    }


    @Bean(name = "checkUni")
    public University checkUniversityClass(){
        return new University(chancellorInfo(),MathTeacherInfo());
    }
}
