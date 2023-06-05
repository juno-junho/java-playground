package com.example.designpattern.factoryMethod;

public class Dog extends Animal{
    @Override
    AnimalToy getToy() {
        return new DogToy();
    }
}
