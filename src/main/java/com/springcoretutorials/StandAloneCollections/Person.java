package com.springcoretutorials.StandAloneCollections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Properties;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private List<String> friends;
    private Map<String, Integer> courseDetails;
    private Properties properties;
}
