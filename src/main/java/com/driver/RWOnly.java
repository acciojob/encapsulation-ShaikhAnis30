package com.driver;

public class RWOnly {
    private String name = "Java";

    public void set(String newName) {
        name = newName;
    }

    public String get(){
        return name;
    }
}
