package com.springcoretutorials.FullyAnotationBasedSpring.UsingComponent_ComponentScan_Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Data
@AllArgsConstructor
@Component("GoldenValley")
public class College {

    @Autowired
    private Tutor tutor;
    @Autowired
    private Principal principal;

    public void test(){
        System.out.println("Testing the component,component scan,configuration");
        tutor.tutoring();
        principal.principalInfo();

    }
}
