package com.example.part5OptionalException;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class Main {
    static void checkNumber(int num) throws MyException {
        if (num < 0) throw new MyException("Số âm không hợp lệ!");
        System.out.println("Số hợp lệ: " + num);
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (MyException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
