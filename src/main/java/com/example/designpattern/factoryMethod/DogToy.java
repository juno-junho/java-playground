package com.example.designpattern.factoryMethod;

public class DogToy extends AnimalToy {
    @Override
    void identify() {
        System.out.println("나는 테니스공! 강아지의 친구");
    }
}
