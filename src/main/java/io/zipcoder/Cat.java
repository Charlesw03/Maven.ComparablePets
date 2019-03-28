package io.zipcoder;

public class Cat extends Pet {
private String name;
private Integer age;


    public Cat(String name, int age, String name1, Integer age1) {
        super(name, age);
        this.name = name1;
        this.age = age1;
    }
}
