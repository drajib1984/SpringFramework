package com.springcoretutorials.SpringExpressionLanguage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component("LoveSpring")
public class Demo {
    @Value("#{2*6}")
    private int x;
    @Value("#{8<6?88:55}")  //using conditional statements
    private int y;
    @Value("#{T(Math).sqrt(625)}") //calling static methods
    private double z;
    @Value("#{T(Math).PI}")    //calling variables
    private double a;
    @Value("#{new String('Rajib Das')}")  //crating an object
    private String name;
    @Value("#{new Boolean(true)}")
    private boolean value;
    @Value("#{8-4>3}")
    private boolean checkStatus; // by default false, unless specified
}
