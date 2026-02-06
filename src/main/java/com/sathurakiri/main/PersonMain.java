package com.sathurakiri.main;

public class PersonMain {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(10000);
        p.setName("randy orton");
        System.out.println(p.getAge());
        System.out.println(p.getName());
    }
}
