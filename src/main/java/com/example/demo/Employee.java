package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
    private final String id;
    private final String name;

    public Employee(@JsonProperty("id") String id,
                    @JsonProperty("name") String name) {

        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}


