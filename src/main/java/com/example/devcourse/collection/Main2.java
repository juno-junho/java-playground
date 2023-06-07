package com.example.devcourse.collection;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        new MyCollection<>(
                List.of(
                        new User(14, "AAA"),
                        new User(15, "FOK"),
                        new User(16, "LKF"),
                        new User(17, "GFA"),
                        new User(18, "GQA"),
                        new User(19, "HQA"),
                        new User(31, "GAA"),
                        new User(23, "GQA"),
                        new User(25, "AFA"),
                        new User(32, "AGA")
                )
        )
                .filter(User::isAdult)
                .foreach(System.out::println);
    }
}
