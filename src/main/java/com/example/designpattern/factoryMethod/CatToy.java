package com.example.designpattern.factoryMethod;

public class CatToy extends AnimalToy {
    @Override
    void identify() {
        System.out.println("나는 캣 타워 고양이의 친구");
    }
}
