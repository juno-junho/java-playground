package com.example.devcourse.stream;

import java.util.stream.Stream;

class Main {

    public static void main(String[] args) {
        Stream.of("A", "AB", "ABC", "ABCD", "ABCDE")
                .map(String::length)
                .filter(i -> i % 2 == 1)
                .forEach(System.out::println);
    }
}
