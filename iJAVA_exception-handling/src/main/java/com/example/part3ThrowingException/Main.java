package com.example.part3ThrowingException;

public class Main {
    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Tuổi phải >= 18");
        }
        System.out.println("Đủ tuổi truy cập.");
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
