package com.example.part1DivideTo0;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b; // sẽ gây ArithmeticException
            System.out.println("Kết quả: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: Chia cho 0 không hợp lệ!");
        } finally {
            System.out.println("Khối finally luôn chạy.");
        }
    }
}
