package com.example.part2CatchManyTypesOfException;

public class Main {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[5] = 10; // lỗi ArrayIndexOutOfBounds
        } catch (ArithmeticException e) {
            System.out.println("Lỗi toán học.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lỗi: Truy cập ngoài giới hạn mảng.");
        } catch (Exception e) {
            System.out.println("Một lỗi khác xảy ra: " + e);
        }
    }
}
