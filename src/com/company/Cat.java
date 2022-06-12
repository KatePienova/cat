package com.company;

import java.util.Objects;

public class Cat {
    String name;
    int age;
    int weight;
    String breed;

    public Cat(int i) {
        System.out.println("Создание питомца");
    }

    public Cat(String name, int age, int weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Информация о коте : " + '\n' +
                "имя = " + this.name + '\n' +
                "возраст = " + this.age + '\n' +
                "вес = " + this.weight + '\n' +
                "порода = " + this.breed + '\n';
    }

    public boolean equals(Object anothercat) {
        if (anothercat instanceof Cat) {
            Cat cat = (Cat) anothercat;
            return Objects.equals(this.weight, cat.weight) && this.age == cat.age;
        }
        return false;
    }

    public void mew (){
        System.out.println("мяуканье" + '\n');
    }


}
