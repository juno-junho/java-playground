package com.example.designpattern.templateMethod;

public class Dog extends Animal{
    @Override
    void play() {
        System.out.println("멍멍");
    }

    @Override
    void runSomething() {
        System.out.println("멍멍~ 꼬리 살랑 살랑");
    }
}
