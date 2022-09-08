package com.springcoretutorials.FullyAnotationBasedSpring.UsingOnlyBean;

import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
public class Chancellor {
    public void whoIsChancellor(){
        System.out.println("Dr. Subhash Saha is the chancellor");
    }
}
