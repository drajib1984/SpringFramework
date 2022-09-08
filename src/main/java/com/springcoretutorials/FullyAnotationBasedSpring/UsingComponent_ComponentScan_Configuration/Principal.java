package com.springcoretutorials.FullyAnotationBasedSpring.UsingComponent_ComponentScan_Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@AllArgsConstructor
@Component
public class Principal {
    public void principalInfo(){
        System.out.println("Principal name is I.D Mishra");
        System.out.println("He was a great English Teacher too");
    }
}
