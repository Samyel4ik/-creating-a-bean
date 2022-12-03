package org.example.Entities;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name = "бобик";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
