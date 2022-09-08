package com.springcoretutorials.AutoWiring.UsingXML;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Address {
    private String streetName;
    private String cityName;
}
