package com.springcoretutorials.CollectionInjection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String employeeName;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String,String> courses;
    private Properties properties;
}
