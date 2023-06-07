package com.example.devcourse.optional;

import com.example.devcourse.collection.User;

class Main {
    public static void main(String[] args) {
        // NPE 발생 막는 방법
        User user = User.EMPTY;
    }
}
