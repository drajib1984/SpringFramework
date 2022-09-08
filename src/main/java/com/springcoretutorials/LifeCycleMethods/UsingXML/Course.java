package com.springcoretutorials.LifeCycleMethods.UsingXML;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private int courseFee;

    public void init(){
        System.out.println("Calling the in-it method");
    }
    public void destroy(){
        System.out.println("Calling destroy method");
    }
}
