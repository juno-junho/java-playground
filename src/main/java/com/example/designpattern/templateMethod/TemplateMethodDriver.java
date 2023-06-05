package com.example.designpattern.templateMethod;

public class TemplateMethodDriver {
    public static void main(String[] args) {

        Animal bolt = new Dog();
        Animal kitty = new Cat();

        bolt.play();
        bolt.runSomething();

        System.out.println();
        bolt.playWithOther();

        System.out.println();
        System.out.println();

        kitty.playWithOther();
    }
}
