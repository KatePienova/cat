package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    final static BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println();

        Message.printIntro();

        Cat cat1 = Commands.registerCat(BUFFERED_READER);

        System.out.println(cat1);
        cat1.mew();

        Message.printAnotherMessage();
        Cat cat2 = Commands.registerCat(BUFFERED_READER);
        System.out.println(cat2);
        cat2.mew();

        Message.printCheckMessage();
        System.out.println(cat1.equals(cat2));
        Commands.verifyCat(cat1,cat2);
    }
}