package com.springcoretutorials.FullyAnotationBasedSpring.UsingComponent_ComponentScan_Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
public class ScienceTutor implements Tutor{
    @Override
    public void tutoring() {
        System.out.println("Science teacher is Amalendu Roy a.k.a Amal Sir");
        System.out.println("All time we have seen him in beard");
    }
}
