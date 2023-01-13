//task 1
package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();  // task 3

        // task 4
        //obj.name = "Java Programming";
        // System.out.println(obj.name);
        // java: name has private access in com.driver.RWOnly

        // task 6
        obj.setName("Java Programming");
        System.out.println(obj.getName());
    }
}