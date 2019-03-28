package io.zipcoder;

public class Pet implements Comparable<Pet> {
    public String name;
    public int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Pet o) {
        return 0;
    }
}
