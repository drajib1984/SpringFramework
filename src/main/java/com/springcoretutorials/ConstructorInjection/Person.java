package com.springcoretutorials.ConstructorInjection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private int id;
    private Certificate certificate;
    private List<String> list;
}
