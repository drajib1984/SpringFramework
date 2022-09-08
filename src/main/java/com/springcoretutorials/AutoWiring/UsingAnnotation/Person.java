package com.springcoretutorials.AutoWiring.UsingAnnotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Data

@NoArgsConstructor
public class Person {
    @Qualifier("statistics3")  // used to say the ban to be autowired in case of multiple beans
    @Autowired
    private Statistics statistics;

//    @Autowired
    public void setStatistics( Statistics statistics) {
        this.statistics = statistics;
        System.out.println("Inside the setter method");
    }
//    @Autowired
    public Person(Statistics statistics) {
        this.statistics = statistics;
        System.out.println("Inside the constructor");
    }
}
