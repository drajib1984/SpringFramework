package com.springcoretutorials.FullyAnotationBasedSpring.UsingOnlyBean;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class University {

    private Chancellor chancellor;
    private Teacher teacher;
    public void implementingMethods(){
        teacher.teach();
        chancellor.whoIsChancellor();
        System.out.println("Created University ID");
    }
}
