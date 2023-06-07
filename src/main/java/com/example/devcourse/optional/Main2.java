package com.example.devcourse.optional;

import com.example.devcourse.collection.User;

import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
        Optional<User> optionalUser  = Optional.empty();
        optionalUser = Optional.of(new User(1, "2"));

        if (optionalUser.isPresent()) {
            // do something 1...
        } else {
            // do something 2...
        }

        optionalUser.ifPresent(user -> {
            // do something 1...
        });
        optionalUser.ifPresentOrElse(user -> {
            // do something 1...
        }, () -> {
            // do something 2...
        });
    }
}
