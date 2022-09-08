package com.springcoretutorials.FullyAnotationBasedSpring.UsingOnlyBean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MathTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("Math teacher is Bivash Roy");
        System.out.println("Bivash Roy favourite line: What is this???");
    }
}
