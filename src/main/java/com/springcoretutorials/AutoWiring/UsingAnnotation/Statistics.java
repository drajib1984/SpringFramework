package com.springcoretutorials.AutoWiring.UsingAnnotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Statistics {
    private int age;
    private double height;
    private String education;
}
