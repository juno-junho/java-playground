package com.example.designpattern.singleton;

public class ClientUsingSingleton {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);

        singleton1 = null;
        singleton2 = null;
        singleton3 = null;
    }
}
