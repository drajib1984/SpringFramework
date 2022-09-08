package com.springcoretutorials.StereotypeAnnotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Component("azad")
@Scope(scopeName ="prototype")
public class Student {
    @Value("RANJIT KUMAR DAS")
    private String studentName;
    @Value("GANGANAGAR")
    private String city;
    @Value("#{list}")
    private List<String> address;
    @Value("#{map2}")
    private Map<String, Integer> courseDetails;

}
