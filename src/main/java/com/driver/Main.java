package com.driver;

public class Main {
  public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        // obj.name = "java Programming";
        // Error -> 'name' has private access in 'com.exe.RWOnly'

        obj.set("Java Programming");
        String res = obj.get();
        System.out.println(res);
    }
}
