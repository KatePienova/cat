package com.company;

import com.company.Cat;

import java.io.BufferedReader;
import java.io.IOException;

public class Commands {
    public static Cat registerCat(BufferedReader bufferedReader) throws IOException {
        System.out.println("Введите имя кота :");
        String name  = bufferedReader.readLine();

        System.out.println("Введите возраст кота :");
        int age = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Введите его вес :");
        int weight = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Введите породу вашего кота :");
        String breed = bufferedReader.readLine();

        return new Cat(name, age, weight, breed);
    }

    public static void verifyCat(Cat object, Cat anotherObj) {
        if (object.equals(anotherObj) == true) {
            System.out.println("Ошибка");
        }

        if (object.equals(anotherObj) == false) {
            System.out.println("Всё работает");
        }
    }
}