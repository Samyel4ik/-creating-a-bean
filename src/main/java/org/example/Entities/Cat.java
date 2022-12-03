package org.example.Entities;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name = "барсик";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
